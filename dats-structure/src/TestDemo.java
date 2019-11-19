import java.util.Scanner;

/**
 * @date 2019-11-18
 * @since JDK1.8
 */
public class TestDemo {

    private static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    private static void sub(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    private static void mul(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void div(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "-1/-2";
        char[] chars = line.toCharArray();
        int location = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 57 || chars[i] < 48 && i != 0) {
                location = i;
                break;
            }
        }
        switch (chars[location]) {
            case '*':
                String[] strings = line.split("\\*");
                mul(Integer.valueOf(strings[0]), Integer.valueOf(strings[1]));
                break;
            case '-':
                sub(Integer.valueOf(line.substring(0, location)), Integer.valueOf(line.substring(location + 1, line.length())));
                break;
            case '+':
                strings = line.split("\\+");
                add(Integer.valueOf(strings[0]), Integer.valueOf(strings[1]));
                break;
            case '/':
                strings = line.split("/");
                div(Double.valueOf(strings[0]), Double.valueOf(strings[1]));
                break;
            default:
                break;
        }
    }
}
