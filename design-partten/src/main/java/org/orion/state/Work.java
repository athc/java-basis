package org.orion.state;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-12
 * @since JDK1.8
 */
public class Work {

  private int hour;

  private Boolean finished;

  private State state;

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public void work() {
    state.working(this);
  }
}
