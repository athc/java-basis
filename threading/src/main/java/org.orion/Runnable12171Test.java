package org.orion;


import org.junit.Test;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Runnable12171Test {


    @Test
    public void test() throws InterruptedException {
        ConcurrentLinkedQueue<String> bag = new ConcurrentLinkedQueue<String>();
        Runnable p = () -> {
            synchronized (this) {
                while (true) {
                    bag.add(System.currentTimeMillis() + "");
                    System.out.println("生产了：" + bag.size());
                    if (!bag.isEmpty()) {
                        try {
                            notifyAll();
                            wait();
                            System.out.println("生产唤醒le");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        Runnable c = () -> {
            synchronized (this) {
                while (true) {
                    System.out.println("消费了：" + bag.poll());
                    if (bag.isEmpty()) {
                        try {
                            notifyAll();
                            wait();
                            System.out.println("消费唤醒le");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        Thread t = new Thread(p);
        Thread t2 = new Thread(c);
        t.start();
        t2.start();
        Thread.sleep(1000 * 6);
    }


}
