package org.orion.factory;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 * 简单工厂模式
 */
public class SimpleFactory {

  //通过key 来装配 不满足开闭原则
  private static Shape getShape(String key) {
    if ("CIRCLE".equals(key)) {
      return new Circle();
    } else if ("SQUARE".equals(key)) {
      return new Square();
    } else {
      return new Shape();
    }
  }

  /**
   * 改进通过 class 装配
   *
   * @param tClass
   * @return
   */
  private static Object getShape(Class<? extends Shape> tClass) {
    Object shape = null;
    try {
      //反射
//      shape = tClass.newInstance();
      shape = Class.forName(tClass.getName()).newInstance();
    } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return shape;
  }

  public static void main(String[] args) {
    Shape shape = SimpleFactory.getShape("CIRCLE");
    shape.show();
    Shape shape1 = SimpleFactory.getShape("SQUARE");
    shape1.show();

    Shape shape2 = (Shape) SimpleFactory.getShape(Circle.class);
    shape2.show();
    Shape shape3 = (Shape) SimpleFactory.getShape(Square.class);
    shape3.show();

    //工厂方法模式给每一个类都提供一个工厂
    Factory factory = new CircleFactory();
    Shape shape4 = factory.getShape();
    shape4.show();

  }
}
