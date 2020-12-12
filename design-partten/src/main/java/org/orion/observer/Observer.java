package org.orion.observer;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public interface Observer {

  void addColleague(Colleague colleague);

  void removeColleague(Colleague colleague);

  void notifyColleague();
}
