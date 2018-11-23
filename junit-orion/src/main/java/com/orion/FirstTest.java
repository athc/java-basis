package com.orion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/19
 * @since JDK1.8
 */

class FirstTest {

  @Test
  @DisplayName("first ")
  public void myFirstTest() {
    try {
      Class a = Class.forName("com.orion.FirstTest");
      FirstTest o = (FirstTest) a.newInstance();
      System.out.println(o);
    } catch (Exception e) {

    }
    assertEquals(2, 1 + 1);
  }

}