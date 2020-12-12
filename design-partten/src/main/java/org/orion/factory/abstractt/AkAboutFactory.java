package org.orion.factory.abstractt;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class AkAboutFactory implements BaseFactory {

  @Override public Gun getGun() {
    return new AkGun();
  }

  @Override public Bullet getBullet() {
    return new AkBullet();
  }
}
