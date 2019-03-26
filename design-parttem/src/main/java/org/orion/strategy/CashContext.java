package org.orion.strategy;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-05
 * @since JDK1.8
 * 策略上下文
 */
public class CashContext {
  private Cash cash;

  public CashContext(Cash cash) {
    this.cash = cash;
  }

  public CashContext(Strategy strategy) {
    switch (strategy) {
      case NOMAL:
        cash = new CashNormal();
        break;
      case CASH9ON:
        cash = new Cash9On();
        break;
      case REBATE:
        cash = new CashRebate();
        break;
      default:
        System.out.println("error!!!");
    }
  }

  public double cashTextInterface(double money) {
    return cash.paid(money);
  }
}
