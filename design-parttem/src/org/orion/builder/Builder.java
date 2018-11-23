package org.orion.builder;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public abstract class Builder {

  private People people = new People();

  public abstract void buildClothes();

  public abstract void buildPants();

  public abstract void buildShoes();

  public People getPeople() {
    return people;
  }
}
