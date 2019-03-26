package org.orion.state;


import org.junit.Test;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-12
 * @since JDK1.8
 * 状态模式测试
 */
public class StateTest {

  @Test
  public void testState() {
    Work work = new Work();
    work.setHour(9);
    work.setFinished(false);
    State state = new MorningState();
    state.working(work);


    work.setHour(12);
    state = new NoonState();
    state.working(work);

    work.setHour(15);
    state = new AfternoonState();
    state.working(work);

    work.setHour(17);
    state = new AfternoonState();
    state.working(work);

    work.setHour(18);
    state = new AfternoonState();
    state.working(work);

    work.setHour(19);
    state = new NightState();
    state.working(work);

    work.setHour(20);
    work.setFinished(true);
    state = new NightState();
    state.working(work);

  }

}
