package org.orion;

import java.util.Date;
import java.util.Properties;
import sun.tools.tree.DivideExpression;

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/22
 * @since JDK1.8
 */
public class Property {

  /**
   * @param args 参数
   */
  public static void main(String[] args) {

    System.out.println(new Date());

    Properties p = System.getProperties();
    p.list(System.out);
    System.out.println(" ---------------");
    Runtime runtime = Runtime.getRuntime();
    System.out.println(runtime.totalMemory() + ":" + runtime.freeMemory());
    try {
      throw new NullPointerException("去啊啊");
    } catch (NullException e) {
      System.out.println("name is ''");
    } catch (NullPointerException e) {
      System.out.println(e.getLocalizedMessage());
      System.out.println("name is null");
    } finally {
      System.out.println("execute");
    }
  }

}
