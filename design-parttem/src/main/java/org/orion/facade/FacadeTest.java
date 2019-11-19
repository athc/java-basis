package org.orion.facade;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class FacadeTest {
  public static void main(String[] args) {
    People people = new People();
    people.setComputer(new Computer());
    people.setMobile(new Mobile());
    people.start();
    people.stop();
  }
}
