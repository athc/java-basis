package org.orion;


/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-11
 * @since JDK1.8
 */
public class RunnableTest12161 {

    /**
     * 静态方法 通过实体类调用 编译没问题
     *
     * @param args
     */
    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println(order.count);
    }

    static class Order {
        public static int count = 1;
        public static final int number = 2;


        public static void hello() {
            System.out.println("hello!");
        }
    }
}
