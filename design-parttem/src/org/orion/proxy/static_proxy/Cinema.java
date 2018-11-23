package org.orion.proxy.static_proxy;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/31
 * @since JDK1.8
 */
public class Cinema implements Movie {

  private Ant2Movie ant2Movie;

  public Cinema() {
  }

  public Cinema(Ant2Movie ant2Movie) {
    this.ant2Movie = ant2Movie;
  }

  @Override public void play() {
    food();
    ad();
    ant2Movie.play();
  }

  private void ad() {
    System.out.println("广告。。。。");
  }

  private void food() {
    System.out.println("卖爆米花");
  }
}
