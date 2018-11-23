package org.orion.builder;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class BuilderTest {

  public static void main(String[] args) {

    ManBuilder manBuilder = new ManBuilder();
    Director director = new Director();
    director.setBuilder(manBuilder);
    director.construct();

    WomanBuilder womanBuilder = new WomanBuilder();
    director = new Director();
    director.setBuilder(womanBuilder);
    director.construct();
  }
}
