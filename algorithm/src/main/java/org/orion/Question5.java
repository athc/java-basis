package org.orion;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.Executors;

/**
 * @author <a href="http://github.com/athc">j</a>
 * @date 2019-11-20
 * @since JDK1.8
 * 将一个字符串中的空格替换成 "%20"。
 */
public class Question5 {

    //12345
    //54321

    private Stack<Integer> front = new Stack<>();

    private Stack<Integer> back = new Stack<>();


    public Integer pop() {
        if (!back.isEmpty()) {
            return back.pop();
        } else {
            while (!front.isEmpty()) {
                back.push(front.pop());
            }
            if (back.isEmpty()) {
                throw new IllegalStateException();
            }
            return back.pop();
        }
    }

    public void push(Integer number) {
        front.push(number);
    }

    public static void main(String[] args) {
        //控制台输入
        //Scanner sc = new Scanner(System.in);

        Question5 question5 = new Question5();
        question5.push(1);
        question5.push(3);
        question5.push(4);
        System.out.println(question5.pop());
        question5.push(5);
        System.out.println(question5.pop());
        question5.push(7);
        question5.push(2);
        System.out.println(question5.pop());
        System.out.println(question5.pop());
        System.out.println(question5.pop());
        System.out.println(question5.pop());
    }


}
