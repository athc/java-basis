package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/26
 * @since JDK1.8
 */
public class MyString implements Comparable {

  private String name;

  public MyString(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override public String toString() {
    return "MyString{" +
        "name='" + name + '\'' +
        '}';
  }

  @Override protected Object clone() throws CloneNotSupportedException {
    return new StringBuffer().append("aaa").append(name);
  }

  @Override public int compareTo(Object o) {
    return 0;
  }
}
