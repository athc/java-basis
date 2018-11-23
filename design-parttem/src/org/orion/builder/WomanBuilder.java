package org.orion.builder;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class WomanBuilder extends Builder {

  @Override public void buildClothes() {
    System.out.println("woman clothes");
  }

  @Override public void buildPants() {
    System.out.println("woman Pants");
  }

  @Override public void buildShoes() {
    System.out.println("woman Shoes");
  }
}
