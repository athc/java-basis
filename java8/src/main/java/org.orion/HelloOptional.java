package org.orion;


import java.util.Optional;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/11/25
 * @since JDK1.8
 */
public class HelloOptional {

  public static void main(String[] args) {

    Optional optional = Optional.of(new Computer("ACC", "dell"));
    //判断optional 是否有值
    optional.isPresent();

    //有值才执行
//    optional.ifPresent();
    try {
      optional.orElseThrow(RuntimeException::new);
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
  }

}
