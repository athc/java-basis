package org.orion.proxy.static_proxy;


/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/31
 * @since JDK1.8
 */
public class ProxyTest {
  public static void main(String[] args) {
    Ant2Movie ant2Movie = new Ant2Movie();
    Cinema cinema = new Cinema(ant2Movie);
    cinema.play();
  }
}
