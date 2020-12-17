package org.orion;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class RunnableTest12143 {

    private static Phone phone;

    ReentrantLock lock = new ReentrantLock();

    @Test
    public void testSingle() throws InterruptedException {
        Runnable runnable = () -> {
            // fixme：这段代码并发访问存在安全问题 多个程序都过了if 被切换 回产生不同对象
            if (null == phone) {
                phone = new Phone();
            }
            System.out.println(phone.toString());

        };

        Thread thread;
        for (int i = 0; i < 100; i++) {
            thread = new Thread(runnable);
            thread.start();
        }
        Thread.sleep(100);
    }
}
