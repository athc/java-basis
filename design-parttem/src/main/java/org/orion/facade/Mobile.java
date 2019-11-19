package org.orion.facade;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class Mobile implements Base {
  @Override public void start() {
    System.out.println("Mobile start");
  }

  @Override public void stop() {
    System.out.println("Mobile stop");
  }
}
