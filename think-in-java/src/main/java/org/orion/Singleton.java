package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/28
 * @since JDK1.8
 * 单例模式
 */
public class Singleton {

  private static int NUMBER = 0;

  private static Singleton singleton = null;

  public static Singleton getSingleton() {
    if (null == singleton) {
      singleton = new Singleton();
    }
    return singleton;
  }

  public static int getNumber() {
    return NUMBER;
  }

  public static int setNumber() {
    return NUMBER += 1;
  }

  public static void main(String[] args) {
    Singleton singleton = Singleton.getSingleton();
    Singleton singleton1 = Singleton.getSingleton();
    if (singleton.hashCode() == singleton1.hashCode()) {
      System.out.println("同一个对象");
    } else {
      System.out.println("不同的对象");
    }
  }
}
