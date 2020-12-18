package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Runnable12142Test {

    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        Runnable runnable = () -> {
            System.out.println("计数增加=====：" + phone.countAdd());
        };

        Thread thread;
        for (int i = 0; i < 5; i++) {
            thread = new Thread(runnable);
            thread.start();
        }
        Thread.sleep(100);
    }
}
