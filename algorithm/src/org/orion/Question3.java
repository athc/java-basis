package org.orion;

/**
 * @author <a href="http://github.com/athc">j</a>
 * @date 2019-11-20
 * @since JDK1.8
 * 将一个字符串中的空格替换成 "%20"。
 */
public class Question3 {


    public static void main(String[] args) {
        //控制台输入
        //Scanner sc = new Scanner(System.in);
        replaceBlack("aac abc abcd");

    }

    private static void replaceBlack(String str) {
        String newStr = str.replace(" ", "20%");
        System.out.println(newStr);
    }
}
