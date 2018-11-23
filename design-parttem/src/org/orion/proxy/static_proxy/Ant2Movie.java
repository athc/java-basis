package org.orion.proxy.static_proxy;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/31
 * @since JDK1.8
 */
public class Ant2Movie implements Movie {
  @Override public void play() {
    System.out.println("即将播放蚁人2");
  }
}
