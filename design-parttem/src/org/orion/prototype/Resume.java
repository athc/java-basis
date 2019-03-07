package org.orion.prototype;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-07
 * @since JDK1.8
 */
public class Resume implements Cloneable {
  private String name;
  private String email;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public Resume(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void show() {
    System.out.println("name:" + name + " email: " + email);
  }

  @Override protected Object clone() throws CloneNotSupportedException {
    return (Object) super.clone();
  }
}
