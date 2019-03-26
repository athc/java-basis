package org.orion.proxy.static_proxy;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/31
 * @since JDK1.8
 */
public class Cinema implements Movie {

  private Movie movie;

  public Cinema() {
  }

  public Cinema(Ant2Movie ant2Movie) {
    this.movie = ant2Movie;
  }

  @Override public void play() {
    food();
    ad();
    movie.play();
  }

  private void ad() {
    System.out.println("广告。。。。");
  }

  private void food() {
    System.out.println("卖爆米花");
  }
}
