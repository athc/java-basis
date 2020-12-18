package org.orion;


import java.util.List;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/7
 * @since JDK1.8
 */


class Week {}

public class ArrayDemo {

  public static void main(String[] args) {
    Week wee;
    Week[] weeks = new Week[5];
    for (int i = 0; i < weeks.length; i++) {
      weeks[i] = new Week();
    }
    Week[] weeks1 = { new Week(), new Week(), new Week() };
    //
    int[] a = new int[5];
    a[0] = 1;
    a[2] = 2;
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    int[][] b = new int[2][3];
    b[0][0] = 2;
  }
}
