package org.orion.factory.abstractt;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class M4a1AboutFactory implements BaseFactory {
  @Override public Gun getGun() {
    return new M4a1Gun();
  }

  @Override public Bullet getBullet() {
    return new M4a1Bullet();
  }
}
