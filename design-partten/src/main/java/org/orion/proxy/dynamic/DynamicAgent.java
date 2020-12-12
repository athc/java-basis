package org.orion.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/9/6
 * @since JDK1.8
 */
public class DynamicAgent {


  static class MyHandler implements InvocationHandler {

    private Object proxy;

    private MyHandler(Object proxy) {
      this.proxy = proxy;
    }

    @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      System.out.println("------------before-------------");
      Object object = method.invoke(this.proxy, args);
      System.out.println("------------after-------------");
      return object;
    }
  }

  /**
   * 返回一个被修改的对象
   *
   * @param cla
   * @param proxy
   * @return
   */
  public static Object agent(Class cla, Object proxy) {
    return Proxy.newProxyInstance(cla.getClassLoader(), new Class[]{ cla }, new MyHandler(proxy));
  }
}
