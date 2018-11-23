package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/27
 * @since JDK1.8
 */
public class ThreadPeople extends Thread {

  private ThreadPeople() {
    System.out.println("beginning ----");
  }

  @Override public void run() {
    try {
      System.out.println("threading --------");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Override public void finalize() {
    System.out.println("close -----");
  }

  public static void main(String[] args) {
    ThreadPeople tp = new ThreadPeople();
    ThreadPeople tp1 = new ThreadPeople();
    ThreadPeople tp2 = new ThreadPeople();
    tp.run();
    tp1.run();
    tp2.run();

    CloseThread cc = new CloseThread();
    CloseThread cc1 = new CloseThread();
    CloseThread cc2 = new CloseThread();
    cc.run();
    cc1.run();
    cc2.run();
  }
}
