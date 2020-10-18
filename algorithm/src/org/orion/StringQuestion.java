package org.orion;

import java.util.Arrays;

public class StringQuestion {

    /**
     * 替换空白字符串
     *
     * @param str
     */
    private static void replaceBlack(String str) {
        String res = str.replace(" ", "%20");
        System.out.println(res);
    }

    private static void maxPrefix(String[] strs) {
        // 数组长度
        int len = strs.length;
        // 用于保存结果
        StringBuilder res = new StringBuilder();
        // 给字符串数组的元素按照升序排序(包含数字的话，数字会排在前面)
        Arrays.sort(strs);
        int m = strs[0].length();
        int n = strs[len - 1].length();
        int num = Math.min(m, n);
        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i) == strs[len - 1].charAt(i)) {
                res.append(strs[0].charAt(i));
            } else {
                break;
            }

        }
        System.out.println(res.toString());
    }

    private static void maxCallback(String str) {
        int length = 0;
        for (int i = 0, j = str.length(); i < j / 2; i++) {
            if (str.charAt(i) == str.charAt(j - 1 - i)) {
                length++;
            } else {
                break;
            }
        }
        System.out.println(length);
    }

    private static void max(String str) {
        int length = 0, max = 0;
        for (int i = 0, j = str.length(); i < j; i++) {
            if (str.charAt(i) == '(') {
                length++;
            } else {
                length--;
            }
            max = Math.max(max, length);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
//        replaceBlack("Hello world!!!!");
//        maxPrefix(new String[]{ "aa", "acbc", "aaaaac" });
//        maxCallback("abcdeadcba");
        max("()((()()()()()((((((()))))))))(())(())");
        Integer.valueOf("256789");
    }

}
