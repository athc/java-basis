package org.orion.appearance;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class AppearenceTest {

  public static void main(String[] args) {
    //直接购买
    AStock aStock = new AStock();
    BStock bStock = new BStock();
    aStock.buy();
    bStock.buy();
    aStock.sell();
    bStock.sell();
    System.out.println("----------------");
    //通过基金购买
    Fund fund = new Fund(aStock, bStock);
    fund.buy();
    fund.sell();
  }
}
