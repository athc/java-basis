package org.orion.builder;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class ManBuilder extends PeopleBuilder {

  @Override public void buildHead() {
    System.out.println("man head");
  }

  @Override public void buildArmLeft() {
    System.out.println("man arm left");
  }

  @Override public void buildArmRight() {
    System.out.println("man arm right");
  }

  @Override public void buildLegLeft() {
    System.out.println("man leg left");
  }

  @Override public void buildLegRight() {
    System.out.println("man leg right");
  }

  @Override public void buildClothes() {
    System.out.println("man leg clothes");
  }

  @Override public void buildPants() {
    System.out.println("man Pants");
  }

  @Override public void buildShoes() {
    System.out.println("man Shoes");
  }
}
