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
    //两个人都听不懂
    //中国人说中文
    People chinese = new Chinese();
    chinese.speak();

    //英国人说英文
    People english = new English();
    english.speak();

    People translater = new Translater(chinese);
    translater.speak();

    translater = new Translater(english);
    translater.speak();
  }
}
