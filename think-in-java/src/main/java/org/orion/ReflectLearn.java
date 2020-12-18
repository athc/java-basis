package org.orion;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/26
 * @since JDK1.8
 */
public class ReflectLearn {

  public static void show(String o) {

    try {
      Class aClass = Class.forName(o);
      Class[] classes = aClass.getClasses();
      for (Class aClass1 : classes) {
        System.out.println(aClass1);
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    show("org.orion.Hamster");
    List ls = new Vector();

  }
}
