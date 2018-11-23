package org.orion.builder;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 * 指挥建造
 */

class Director {

  private Builder builder;

  //2 set方法注入builder对象
  public void setBuilder(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.buildClothes();
    builder.buildPants();
    builder.buildShoes();
  }
}
