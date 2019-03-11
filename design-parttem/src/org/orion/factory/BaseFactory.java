package org.orion.factory;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 * 抽象工厂
 */
public interface BaseFactory {

  Gun getGun();

  Bullet getBullet();
}
