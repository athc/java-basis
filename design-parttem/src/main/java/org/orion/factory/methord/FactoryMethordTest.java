package org.orion.factory.methord;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-06
 * @since JDK1.8
 */
public class FactoryMethordTest {

  public static void main(String[] args) {
    Car car = new SmallCarFactory().createCar();
    car.drive();
    car = new TruckFactory().createCar();
    car.drive();
  }
}
