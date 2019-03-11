package org.orion.builder;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class BuilderTest {

  public static void main(String[] args) {
    //指挥者指挥构建
    Director director = new Director();

    ManBuilder manBuilder = new ManBuilder();
    director.setBuilder(manBuilder);
    director.construct();

    System.out.println("----------------");

    WomanBuilder womanBuilder = new WomanBuilder();
    director.setBuilder(womanBuilder);
    director.construct();
  }
}
