package org.orion.strategy;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-05
 * @since JDK1.8
 * 正常支付策略
 */
public class CashNormal extends Cash {

  @Override public double paid(double money) {
    return money;
  }
}
