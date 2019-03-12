package org.orion.factory.abstractt;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class AbstractFactoryTest {

  public static void main(String[] args) {
    BaseFactory baseFactory = new AkAboutFactory();
    Gun gun = baseFactory.getGun();
    Bullet bullet = baseFactory.getBullet();
    gun.shoot();
    bullet.load();

    baseFactory = new M4a1AboutFactory();
    gun = baseFactory.getGun();
    gun.shoot();
    bullet = baseFactory.getBullet();
    bullet.load();
  }
}
