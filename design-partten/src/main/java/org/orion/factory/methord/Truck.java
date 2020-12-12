package org.orion.factory.methord;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-06
 * @since JDK1.8
 */
public class Truck implements Car {
  @Override public void drive() {
    System.out.println("this is truck!!!");
  }
}
