package org.orion.builder;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class WomanBuilder extends PeopleBuilder {

  @Override public void buildHead() {
    System.out.println("Woman head");
  }

  @Override public void buildArmLeft() {
    System.out.println("Woman arm left");
  }

  @Override public void buildArmRight() {
    System.out.println("Woman arm right");
  }

  @Override public void buildLegLeft() {
    System.out.println("Woman leg left");
  }

  @Override public void buildLegRight() {
    System.out.println("Woman leg right");
  }

  @Override public void buildClothes() {
    System.out.println("Woman leg clothes");
  }

  @Override public void buildPants() {
    System.out.println("Woman Pants");
  }

  @Override public void buildShoes() {
    System.out.println("Woman Shoes");
  }
}
