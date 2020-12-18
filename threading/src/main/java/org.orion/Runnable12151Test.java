package org.orion;

import org.junit.jupiter.api.Test;


/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Runnable12151Test {


    @Test
    public void testSingle() throws InterruptedException {
        StopDemo stopDemo = new StopDemo();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(stopDemo);
            thread.start();
        }
        Thread.sleep(50L);
        stopDemo.stop();
        Thread.sleep(10000L);
    }

    static class StopDemo implements Runnable {

        private volatile Boolean stopFlag = false;

        Object lock =new Object();

        @Override
        public void run() {
            int i = 0;
            while (!stopFlag) {
                System.out.println(Thread.currentThread().getName() + "=======线程正在运行中=======：" + i++);
            }
        }

        public void stop() {
            this.stopFlag = true;
        }
    }


}
