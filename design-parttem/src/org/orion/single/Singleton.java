package org.orion.single;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/9/7
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * @author dujf
 * <p>
 * 懒汉模式
 * @author dujf
 * <p>
 * 懒汉模式
 * @author dujf
 * <p>
 * 懒汉模式
 * @author dujf
 * <p>
 * 懒汉模式
 * @author dujf
 * <p>
 * 懒汉模式
 * @author dujf
 * <p>
 * 懒汉模式
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @author dujf
 * <p>
 * 懒汉模式
 * <p>
 * 静态内部类
 * @since JDK1.8
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 * <p>
 * 饿汉模式，线程安全
 */

/**
 * 饿汉模式，线程安全
 * @author dujf
 */
//public class Singleton {
//  private static Singleton singleton = new Singleton();
//
//  private Singleton getSingleton() {
//    return Singleton.singleton;
//  }
//}

/**
 * 懒汉模式
 */
//public class Singleton {
//
//  private Singleton singleton;
//
//  public Singleton getSingleton() {
//    if (null == singleton) {
//      singleton = new Singleton();
//    }
//    return singleton;
//  }
//}

/**
 * 静态内部类
 */
//public class Singleton {
//
//  private static class SingletonHolder {
//    private static Singleton singleton = new Singleton();
//  }
//
//  public Singleton getSingleton() {
//    return SingletonHolder.singleton;
//  }
//}

/**
 *枚举类实现
 */
public class Singleton {

  /**
   *
   */
  private enum SingletonHolder {

    SINGLETON;

    private Singleton singleton;

    SingletonHolder() {
      singleton = new Singleton();
    }

    public Singleton getSingleton() {
      return singleton;
    }
  }

  public Singleton getInstance() {
    return SingletonHolder.SINGLETON.getSingleton();
  }
}