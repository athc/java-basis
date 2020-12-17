package org.orion;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class RunnableTest12144 {

    @Test
    public void testSingle() {
        Runnable runA = () -> {
            lockBefore();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runB = () -> {
            lockAfter();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(runA);
        Thread t2 = new Thread(runB);

        t1.start();
        t2.start();
        System.out.println("======运行结束===============");
    }

    private final Object a = new Object();
    private final Object b = new Object();

    private void lockBefore() {
        synchronized (a) {
            synchronized (b) {
                System.out.println("a lock before b");
            }
        }
    }

    private void lockAfter() {
        synchronized (b) {
            synchronized (a) {
                System.out.println("b lock before a");
            }
        }
    }
}
