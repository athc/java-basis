package org.orion.factory.methord;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-06
 * @since JDK1.8
 */
public class SmallCarFactory implements CarFactory {


  @Override public Car createCar() {
    return new SmallCar();
  }
}
