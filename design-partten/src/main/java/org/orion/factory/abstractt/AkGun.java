package org.orion.factory.abstractt;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/30
 * @since JDK1.8
 */
public class AkGun implements Gun {

  @Override public void shoot() {
    System.out.println("AK shoot");
  }
}
