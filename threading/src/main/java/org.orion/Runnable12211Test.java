package org.orion;


import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Runnable12211Test {


    /**
     * @return
     * @author dujf
     * @description ReentrantReadWriteLock
     * @date
     **/
    @Test
    public void testReentrantReadWriteLock() throws Exception {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        Thread.sleep(10000L);
        System.out.println("主线程执行完成：" + Thread.currentThread().getName() + ":ID:" + Thread.currentThread().getId());
    }


    static class Producer implements Runnable {

        private ReentrantReadWriteLock lock;

        public Producer(ReentrantReadWriteLock lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            System.out.println("Producer");
        }
    }

    static class Consumer implements Runnable {
        private ReentrantLock lock;

        public Consumer(ReentrantLock lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            System.out.println("Consumer");
        }
    }
}
