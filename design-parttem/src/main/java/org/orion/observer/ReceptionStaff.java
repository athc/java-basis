package org.orion.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 * 前台人员
 */
public class ReceptionStaff implements Observer {

  private List<Colleague> colleagues = new ArrayList<>();

  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public void addColleague(Colleague colleague) {
    colleagues.add(colleague);
  }

  @Override public void removeColleague(Colleague colleague) {
    colleagues.remove(colleague);
  }

  @Override public void notifyColleague() {
    System.out.println(message);
    colleagues.forEach(it -> it.working());
  }
}
