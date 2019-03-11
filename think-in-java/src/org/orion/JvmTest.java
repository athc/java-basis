package org.orion;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/8/29
 * @since JDK1.8
 */
public class JvmTest {

  public static void main(String[] args) {
//    byte[] allocation1, allocation2;
//    allocation1 = new byte[30900*1024];
    //allocation2 = new byte[900*1024];

    byte[] allocation1, allocation2,allocation3,allocation4,allocation5;
    allocation1 = new byte[32000*1024];
    allocation2 = new byte[1000*1024];
    allocation3 = new byte[1000*1024];
    allocation4 = new byte[1000*1024];
    allocation5 = new byte[1000*1024];
  }
}
