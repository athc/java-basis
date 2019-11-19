package org.orion.strategy;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-05
 * @since JDK1.8
 * 每满减200减100
 */
public class CashRebate extends Cash {

  private double maxMoney = 200D;
  private double rebateMoney = 100D;

  @Override public double paid(double money) {
    int rebateTimes = (int) (money / maxMoney);
    if (rebateTimes > 0) {
      return money - rebateTimes * rebateMoney;
    }
    return money;
  }
}
