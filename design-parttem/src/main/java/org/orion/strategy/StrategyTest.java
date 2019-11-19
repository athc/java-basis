package org.orion.strategy;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-05
 * @since JDK1.8
 */
public class StrategyTest {

  public static void main(String[] args) {
    //选择策略
    //正常
    Cash cashNormal = new CashNormal();
    CashContext cashText = new CashContext(cashNormal);
    double res = cashText.cashTextInterface(200.2);
    System.out.println(res);

    //打折策略
    cashNormal = new Cash9On();
    cashText = new CashContext(cashNormal);
    res = cashText.cashTextInterface(200.2);
    System.out.println(res);

    //满减策略
    cashNormal = new CashRebate();
    cashText = new CashContext(cashNormal);
    res = cashText.cashTextInterface(399.999999999);
    System.out.println(res);

    //简单工厂+策略
    //正常
    cashText = new CashContext(Strategy.NOMAL);
    res = cashText.cashTextInterface(200.2);
    System.out.println(res);

    //打折策略
    cashText = new CashContext(Strategy.CASH9ON);
    res = cashText.cashTextInterface(200.2);
    System.out.println(res);

    //满减策略
    cashText = new CashContext(Strategy.REBATE);
    res = cashText.cashTextInterface(399.999999999);
    System.out.println(res);
  }
}
