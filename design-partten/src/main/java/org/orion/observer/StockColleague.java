package org.orion.observer;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class StockColleague implements Colleague {
  private String name = "StockColleague";

  public StockColleague() {
    System.out.print(name);
    playing();
  }

  @Override public void playing() {
    System.out.println(" looking at AStock");
  }

  @Override public void working() {
    System.out.print(name);
    System.out.println(" stop looking at AStock-->begin working");
  }
}
