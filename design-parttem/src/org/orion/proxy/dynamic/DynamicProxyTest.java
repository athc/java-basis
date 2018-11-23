package org.orion.proxy.dynamic;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/9/6
 * @since JDK1.8
 */
public class DynamicProxyTest {

  public static void main(String[] args) {
    Book book = (Book) DynamicAgent.agent(Book.class, new ChineseBook());
    book.read();
  }
}
