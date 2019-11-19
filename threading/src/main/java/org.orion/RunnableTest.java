package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class RunnableTest {
  private static int count = 0;

  public static void main(String[] args) throws InterruptedException {
    Runnable runnable = new Runnable() {
      public void run() {
        for (int i = 0; i < 10000; i++) {
          synchronized (this) {
            count += 1;
          }
        }
      }
    };
    Thread thread = new Thread(runnable);
    Thread thread1 = new Thread(runnable);
    thread.start();
    thread1.start();
    System.out.println(count);

    //join顺序执行
    thread.join();
    thread1.join();
    System.out.println(count);

  }
}
