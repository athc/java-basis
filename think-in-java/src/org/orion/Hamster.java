package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/7
 * @since JDK1.8
 */
public class Hamster implements Rodent {

  @Override public void show() {
    System.out.println("Hamster");
  }


  public static void main(String[] args) {
    Rodent r1=new Mouse();
    r1.show();
    Rodent r2=new Gerbil();
    r2.show();
    Rodent r3=new Hamster();
    r3.show();
  }
}
