package org.orion;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Runnable12261Test {


    /**
     * 带返回值的线程池
     * @return
     * @author dujf
     * @description ReentrantReadWriteLock
     * @date
     **/
    @Test
    public void testCompletionService() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 20, 2, TimeUnit.SECONDS, new LinkedBlockingDeque<>(1000), new ThreadPoolExecutor.AbortPolicy());
        final int size = 100;
        CompletionService<String> completionService = new ExecutorCompletionService<>(threadPoolExecutor);
        LongStream.range(0, size).forEach(it -> {
            Callable<String> callable = () -> {
                Thread.sleep(500L);
                return String.valueOf(it);
            };
            completionService.submit(callable);
        });

        var strings = new ArrayList<String>(size);

        LongStream.range(0, size).forEach(it -> {
            try {
                Future<String> stringFuture = completionService.take();
                strings.add(stringFuture.get());
                System.out.println("返回结果：" + stringFuture.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        System.out.println(strings);
        System.out.println("主线程执行完成：" + Thread.currentThread().getName() + ":ID:" + Thread.currentThread().getId());
    }


    /**
     * 带返回值的线程池
     *
     * @return
     * @author dujf
     * @description ReentrantReadWriteLock
     * @date
     **/
    @Test
    public void testThreadPoolExecutor() throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 20, 2, TimeUnit.SECONDS, new LinkedBlockingDeque<>(1000), new ThreadPoolExecutor.AbortPolicy());
        final int size = 100;

        CountDownLatch countDownLatch = new CountDownLatch(size);
        var strings = new ArrayList<String>(size);

        LongStream.range(0, size).forEach(it -> {
            Callable<String> callable = () -> {
                try {
                    Thread.sleep(500);
                    System.out.println("abbcbc：" + it);
                    return String.valueOf(it);
                } finally {
                    countDownLatch.countDown();
                }
            };
            Future<String> future = threadPoolExecutor.submit(callable);
            try {
                strings.add(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
        System.out.println(strings.toString());
        System.out.println("主线程执行完成：" + Thread.currentThread().getName() + ":ID:" + Thread.currentThread().getId());
    }
}