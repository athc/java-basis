package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Runnable12141Test {

    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        Runnable runnable = () -> {
            if (phone.getCount() == 10) {
                int res = phone.getCount() / 2;
                phone.setCount(res);
                // fixme：正常修改了count 的值应该只会打印一条数据 并发时就会不一样
                System.out.println("=====" + res);
            }
        };

        Thread thread;
        for (int i = 0; i < 5; i++) {
            thread = new Thread(runnable);
            thread.start();
//            thread.join();
        }
        Thread.sleep(100);
    }
}
