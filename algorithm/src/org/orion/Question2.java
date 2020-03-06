package org.orion;

/**
 * @author <a href="http://github.com/athc">j</a>
 * @date 2019-11-20
 * @since JDK1.8
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 */
public class Question2 {


    public static void main(String[] args) {
        //控制台输入
        //Scanner sc = new Scanner(System.in);
        Integer[][] arr = { { 1, 2, 3 }, { 3, 4, 5 }, { 6, 7, 9 } };
        int aimNumber = 9;
        getOneRepeatNumber(aimNumber, arr);

    }

    private static void getOneRepeatNumber(int aimNumber, Integer[][] arr) {
        for (Integer[] integers : arr) {
            for (Integer integer : integers) {
                if (integer.equals(aimNumber)) {
                    System.out.println(aimNumber);
                    return;
                }
            }
        }
        System.out.println("not found " + aimNumber);
    }
}
