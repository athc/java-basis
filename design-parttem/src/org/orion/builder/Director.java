package org.orion.builder;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 * 指挥建造
 */

class Director {
  private PeopleBuilder builder;

  public void setBuilder(PeopleBuilder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.buildHead();
    builder.buildArmLeft();
    builder.buildArmRight();
    builder.buildLegLeft();
    builder.buildLegRight();
    builder.buildClothes();
    builder.buildPants();
    builder.buildShoes();
  }
}
