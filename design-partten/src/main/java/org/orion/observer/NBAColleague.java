package org.orion.observer;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class NBAColleague implements Colleague {

  private String name = "NBAColleague";

  public NBAColleague() {
    System.out.print(name);
    playing();
  }

  @Override public void playing() {
    System.out.println(" looking at NBA");
  }

  @Override public void working() {
    System.out.print(name);
    System.out.println(" stop looking at NBA --> begin working");
  }
}
