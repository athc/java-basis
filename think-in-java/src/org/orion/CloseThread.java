package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/28
 * @since JDK1.8
 */
public class CloseThread extends Thread {

  @Override public void run() {
    System.out.println("close thread");
    System.gc();
    System.runFinalization();
    System.out.println(" close thread success");
  }
}
