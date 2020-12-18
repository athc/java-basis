package org.orion;

import java.io.Serializable;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/7/24
 * @since JDK1.8
 */
public class Person implements Serializable {

  private static final long serialVersionUID = -3471234716530211231L;

  /**
   * name
   */
  private String name;

  public Person() {
    System.out.println("aaa");
  }

  public Person(String name) {
    this.name = name;
    System.out.println(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
