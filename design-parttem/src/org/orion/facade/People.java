package org.orion.facade;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class People implements Base {


  private Mobile mobile;

  private Computer computer;

  public People() {}

  public People(Mobile mobile, Computer computer) {
    this.mobile = mobile;
    this.computer = computer;
  }

  public Mobile getMobile() {
    return mobile;
  }

  public void setMobile(Mobile mobile) {
    this.mobile = mobile;
  }

  public Computer getComputer() {
    return computer;
  }

  public void setComputer(Computer computer) {
    this.computer = computer;
  }

  @Override public void start() {
    mobile.start();
    computer.start();
  }

  @Override public void stop() {
    mobile.stop();
    computer.stop();
  }
}
