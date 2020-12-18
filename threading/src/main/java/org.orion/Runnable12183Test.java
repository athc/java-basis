package org.orion;


import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Runnable12183Test {


    /**
     * @return
     * @author dujf
     * @description 带返回值的线程Callable
     * @date
     **/
    @Test
    public void testCallable() throws Exception {
        Callable<Object> callable = () -> {
            System.out.println("当前线程：" + Thread.currentThread().getName() + ":ID:" + Thread.currentThread().getId());
            Thread.sleep(1000L);
            return Thread.currentThread().getId();
        };
        Object res = Executors.newSingleThreadExecutor().submit(callable).get();
        System.out.println("res:" + res);
        System.out.println("当前线程：" + Thread.currentThread().getName() + ":ID:" + Thread.currentThread().getId());
    }

    /**
     * @return
     * @author dujf
     * @description 带返回值的线程Future
     * @date
     **/
    @Test
    public void testFuture() throws Exception {
        Callable<Object> callable = () -> {
            System.out.println("当前线程：" + Thread.currentThread().getName() + ":ID:" + Thread.currentThread().getId());
            Thread.sleep(1000L);
            return Thread.currentThread().getId();
        };
        FutureTask<Object> futureTask = new FutureTask<>(callable);
//        Thread thread = new Thread(futureTask);
//        thread.start();
        Executors.newSingleThreadExecutor().submit(futureTask);
        System.out.println("res:" + futureTask.get());
        System.out.println("当前线程：" + Thread.currentThread().getName() + ":ID:" + Thread.currentThread().getId());
    }
}
