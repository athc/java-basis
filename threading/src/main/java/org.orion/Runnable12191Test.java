package org.orion;


import org.junit.jupiter.api.Test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Runnable12191Test {


    /**
     * @return
     * @author dujf
     * @description 带返回值的线程Callable
     * @date
     **/
    @Test
    public void testCallable() throws Exception {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        Producer producer = new Producer(lock, condition);
        Consumer consumer = new Consumer(lock, condition);

        Thread thread = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread.start();
        thread2.start();

        Thread.sleep(10000L);
        System.out.println("主线程执行完成：" + Thread.currentThread().getName() + ":ID:" + Thread.currentThread().getId());
    }


    static class Producer implements Runnable {

        private ReentrantLock lock;
        private Condition condition;

        public Producer(ReentrantLock lock, Condition condition) {
            this.lock = lock;
            this.condition = condition;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    this.lock.lock();
                    System.out.println("Producer end");
                    condition.signal();
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        private ReentrantLock lock;
        private Condition condition;

        public Consumer(ReentrantLock lock, Condition condition) {
            this.lock = lock;
            this.condition = condition;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    this.lock.lock();
                    System.out.println("Consumer");
                    condition.signal();
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
