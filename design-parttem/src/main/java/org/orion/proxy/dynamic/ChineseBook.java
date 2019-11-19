package org.orion.proxy.dynamic;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/9/6
 * @since JDK1.8
 */
public class ChineseBook implements Book {

  @Override public void read() {
    System.out.println("learn chinese book");
  }
}
