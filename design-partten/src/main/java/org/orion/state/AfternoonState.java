package org.orion.state;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-12
 * @since JDK1.8
 */
public class AfternoonState extends State {

  private int beginNode = 12;
  private int endNode = 18;

  @Override public void working(Work work) {
    if (work.getHour() > beginNode && work.getHour() <= endNode && null != work.getFinished() && !work.getFinished()) {
      System.out.println(work.getHour() + "点:下午想睡觉，但是我还是要努力工作");
    }
    if (null != work.getFinished() && work.getFinished()) {
      System.out.println(work.getHour() + "点:工作完成了->" + work.getFinished() + "下班了");
    } else {
      work.setState(new NightState());
      work.work();
    }
  }
}
