package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Runnable1213Test {
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            while (!Thread.interrupted()) {
                System.out.println("线程正在运行中" + System.currentTimeMillis());
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(100);
        thread.interrupt();
        System.out.println(count);

    }
}
