package org.orion.decoration;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-06
 * @since JDK1.8
 */
public class Pants extends Finery {

  private String pants;

  public Pants(String pants) {
    this.pants = pants;
  }

  @Override public void show() {
    System.out.println("pants: " + pants);
    super.show();
  }
}
