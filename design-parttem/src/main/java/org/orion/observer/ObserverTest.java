package org.orion.observer;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 * 观察者模式测试
 */
public class ObserverTest {

  public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setMessage("让前台取拿东西没时间报信");

    ReceptionStaff receptionStaff = new ReceptionStaff();
    receptionStaff.setMessage("发现老板回来了，大家注意");

    //看股票同事
    Colleague stockColleague = new StockColleague();
    //看NBA同事
    Colleague nbaColleague = new NBAColleague();
    //请求前台监控老板
    receptionStaff.addColleague(stockColleague);
    receptionStaff.addColleague(nbaColleague);
    //正常前台见到老板回来通知在玩的员工
    receptionStaff.notifyColleague();

    System.out.println("-------------------");
    //stockColleague 看见老板回来了
    boss.addColleague(stockColleague);
    boss.notifyColleague();
  }
}
