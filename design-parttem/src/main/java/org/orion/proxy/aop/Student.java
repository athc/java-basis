package org.orion.proxy.aop;


/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/9/6
 * @since JDK1.8
 */
public class Student implements Library {
  @Override public void rent() {
    System.out.println("student rent...");
  }

  @Override public void back() {
    System.out.println("student bank...");
  }
}