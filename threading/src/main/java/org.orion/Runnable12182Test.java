package org.orion;


import org.junit.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Runnable12182Test {


    /**
     * @return
     * @author dujf
     * @description 测试countDownLatch 用来检测线程执行完成的数量
     * @date
     **/
    @Test
    public void testCountDownLatch() throws InterruptedException {
        final int size = 100;
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < size; i++) {
            Thread thread = new Thread(() -> {
                try {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("执行完成了：" + threadName);
                } finally {
                    // 执行完成计数减少
                    countDownLatch.countDown();
                }

            }, "A" + i);
            thread.start();
        }
        countDownLatch.await();
        System.out.println("执行结束了");
    }

    /**
     * @return
     * @author dujf
     * @description 测试CyclicBarrier 主要用于等待所有线程先处理一部分逻辑完成后才执行后面的逻辑
     * @date
     **/
    @Test
    public void testCyclicBarrier() throws InterruptedException {
        final int size = 100;
        CountDownLatch countDownLatch = new CountDownLatch(size);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(size, () -> System.out.println("========听我号令开始执行====="));
        for (int i = 0; i < size; i++) {
            Thread thread = new Thread(() -> {
                try {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("准备开始执行====：" + threadName);
                    cyclicBarrier.await();
                    System.out.println("====执行完成了：" + threadName);
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }

            }, "A" + i);
            thread.start();
        }
        countDownLatch.await();
        System.out.println("完成执行了======");
    }

    /**
     * @return
     * @author dujf
     * @description 测试Semaphore 类似于锁
     * @date
     **/
    @Test
    public void testSemaphore() throws InterruptedException {
        final int size = 100;
        Semaphore semaphore = new Semaphore(10);
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < size; i++) {
            Thread thread = new Thread(() -> {
                String threadName = Thread.currentThread().getName();
                try {
                    // 没拿到锁直接返回
                    boolean lock = semaphore.tryAcquire();
                    if (!lock) {
                        System.out.println("没拿到锁直接返回了：" + threadName);
                        return;
                    }
                    System.out.println("执行完成了：" + threadName);
                } finally {
                    semaphore.release();
                    countDownLatch.countDown();
                }

            }, "A" + i);
            thread.start();
        }
        countDownLatch.await();
        System.out.println("执行结束了");
    }

    /**
     * @return
     * @author dujf
     * @description 测试Semaphore 类似于锁
     * @date
     **/
    @Test
    public void testSemaphore2() throws InterruptedException {
        final int size = 100;
        Semaphore semaphore = new Semaphore(10);
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < size; i++) {
            Thread thread = new Thread(() -> {
                String threadName = Thread.currentThread().getName();
                try {
                    // 没拿到锁阻塞
                    semaphore.acquire();
                    System.out.println("执行完成了：" + threadName);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                    countDownLatch.countDown();
                }

            }, "A" + i);
            thread.start();
        }
        countDownLatch.await();
        System.out.println("执行结束了");
    }
}
