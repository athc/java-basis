package org.orion.state;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-12
 * @since JDK1.8
 */
public class NightState extends State {

  private int node = 18;

  @Override public void working(Work work) {
    if (work.getHour() > node && null != work.getFinished() && !work.getFinished()) {
      System.out.println(work.getHour() + "点:晚上工作没做完，加班中");
    }

    if (null != work.getFinished() && work.getFinished()) {
      System.out.println(work.getHour() + "点：工作完成->" + work.getFinished());
    }
  }
}
