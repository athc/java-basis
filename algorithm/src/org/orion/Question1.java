package org.orion;

import java.util.Scanner;

/**
 * @author <a href="http://github.com/athc">j</a>
 * @date 2019-11-20
 * @since JDK1.8
 * 请找出数组中任意一个重复的数字
 */
public class Question1 {


    public static void main(String[] args) {
        //控制台输入
        //Scanner sc = new Scanner(System.in);
        Integer[] arr = { 1, 2, 3, 4, 2, 4 };

        getOneRepeatNumber(arr);

    }

    private static void getOneRepeatNumber(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Integer begin = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].equals(begin)) {
                    System.out.println(begin);
                    return;
                }
            }
        }
    }
}
