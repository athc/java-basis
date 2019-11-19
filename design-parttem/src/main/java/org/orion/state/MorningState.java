package org.orion.state;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-12
 * @since JDK1.8
 */
public class MorningState extends State {

  private int node = 12;

  @Override public void working(Work work) {
    if (work.getHour() < node) {
      System.out.println(new StringBuffer(work.getHour() + "点:现在是上午，精神百倍"));
    } else {
      work.setState(new NoonState());
      work.work();
    }
  }
}
