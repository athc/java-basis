package org.orion.factory;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class CircleFactory implements Factory {

  @Override public Shape getShape() {
    return new Circle();
  }
}
