package org.orion.strategy;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-05
 * @since JDK1.8
 * 9折
 */
public class Cash9On extends Cash {
  @Override public double paid(double money) {
    return money * 0.9;
  }
}
