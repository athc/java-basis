package org.orion.decoration;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-06
 * @since JDK1.8
 */
public class Person {

  private String name;


  public void show() {
    System.out.println("name: " + name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
