package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/7/23
 * @since JDK1.8
 */
public class Equivalence {

  public static void print() {
    int i = 1;
    while (i <= 100) {
      System.out.println(i);
      if (i == 20) {
//        return;
        break;
      }
      switch (i) {
        case 1:
          System.out.println("aaa1");break;
        case 10:
          System.out.println("aaa2");break;
        case 11:
          System.out.println("aaa3");break;
        case 12:
          System.out.println("aaaa4");break;
        case 19:
          System.out.println("aaa5");
      }
      i++;
    }
  }

  public static void main(String[] args) {
/**
 *
 */
    Integer n1 = new Integer(47);
    Integer n2 = new Integer(47);
    System.out.println(n1 == n2);
    System.out.println(n1 != n2);
    print();

  }
}
