package org.orion.adapter;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-26
 * @since JDK1.8
 */
public class Translater implements People {
  private People people;

  public Translater(People people) {
    this.people = people;
  }

  @Override public void speak() {
    people.speak();
  }
}
