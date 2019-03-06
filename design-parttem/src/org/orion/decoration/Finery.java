package org.orion.decoration;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-06
 * @since JDK1.8
 */
public class Finery extends Person {

  private Person person;

  public void wear(Person person) {
    this.person = person;
  }

  @Override public void show() {
    person.show();
  }
}
