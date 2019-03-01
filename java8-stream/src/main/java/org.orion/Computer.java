package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/11/25
 * @since JDK1.8
 */
public class Computer {

  private String type;

  private String name;

  public Computer(String type, String name) {
    this.type = type;
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
