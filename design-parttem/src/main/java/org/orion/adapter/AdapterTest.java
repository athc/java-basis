package org.orion.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class AdapterTest {

  public static void main(String[] args) {
    People chinese = new Chinese();
    chinese.speak();

    People english = new English();
    english.speak();
  }
}
