package org.orion.decoration;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-06
 * @since JDK1.8
 */
public class TShirt extends Finery {

  private String tShirt;

  public TShirt(String tShirt) {
    this.tShirt = tShirt;
  }

  @Override public void show() {
    System.out.println("TShirt: " + tShirt);
    super.show();
  }
}
