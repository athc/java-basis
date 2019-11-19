package org.orion.appearance;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class BStock implements Stock {
  @Override public void buy() {
    System.out.println("buy B");
  }

  @Override public void sell() {
    System.out.println("sell B");
  }
}
