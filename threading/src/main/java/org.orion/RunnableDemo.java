
package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-05-16
 * @since JDK1.8
 */
public class RunnableDemo implements Runnable {
  @Override public void run() {
    try {
      System.out.println("begin");
      Thread.sleep(1000 * 10);
      System.out.println("end");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}