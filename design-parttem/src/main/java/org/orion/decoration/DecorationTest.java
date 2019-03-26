package org.orion.decoration;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-06
 * @since JDK1.8
 */
public class DecorationTest {

  public static void main(String[] args) {
    Person wang = new Person();
    wang.setName("wang");

    TShirt tShirt = new TShirt("tShirt");
    tShirt.wear(wang);
    Pants pants = new Pants("pants");
    pants.wear(tShirt);
    pants.show();
  }
}
