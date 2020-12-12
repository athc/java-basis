package org.orion.state;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-12
 * @since JDK1.8
 */
public class NoonState extends State {

  private int node = 12;

  @Override public void working(Work work) {
    if (work.getHour() == node) {
      System.out.println(new StringBuffer(work.getHour() + "点:中午了我好饿，吃饭吧"));
    } else {
      work.setState(new NoonState());
      work.work();
    }
  }
}
