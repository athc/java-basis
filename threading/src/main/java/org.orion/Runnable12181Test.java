package org.orion;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Runnable12181Test {


    @Test
    public void test() throws InterruptedException {
        ConcurrentSkipListSet values = new ConcurrentSkipListSet<>();
        ThreadLocalDemo demo = new ThreadLocalDemo(values);
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(demo, "A" + i);
            thread.start();
        }
        Thread.sleep(1000);
        Assertions.assertEquals(100, values.stream().distinct().count());
    }

    static class ThreadLocalDemo implements Runnable {

        private final ThreadLocal<String> local = new ThreadLocal<>();
        private ConcurrentSkipListSet values;

        public ThreadLocalDemo(ConcurrentSkipListSet values) {
            this.values = values;
        }

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            local.set("线程：" + threadName);
            System.out.println(local.get());
            this.values.add(local.get());
        }
    }
}
