package org.orion.appearance;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class Fund implements Stock {

  private AStock aStock;

  private BStock bStock;

  public Fund(AStock aStock, BStock bStock) {
    this.aStock = aStock;
    this.bStock = bStock;
  }

  @Override public void buy() {
    aStock.buy();
    bStock.buy();
  }

  @Override public void sell() {
    aStock.sell();
    bStock.sell();
  }
}
