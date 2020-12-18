package org.orion;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author <a href="http://github.com/athc">j</a>
 * @date 2019-11-20
 * @since JDK1.8
 * 将一个字符串中的空格替换成 "%20"。
 */
public class Question4 {


    public static void main(String[] args) {
        //控制台输入
        //Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(new Random().nextInt(10));
        }
        number(numbers);
    }

    private static void number(LinkedList<Integer> numbers) {
        while (numbers.size() > 0){
            System.out.println(numbers.pollLast());
        }
    }
}
