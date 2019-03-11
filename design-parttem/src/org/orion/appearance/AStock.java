package org.orion.appearance;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class AStock implements Stock {

  @Override public void buy() {
    System.out.println("buy A");
  }

  @Override public void sell() {
    System.out.println("sell A");
  }
}
