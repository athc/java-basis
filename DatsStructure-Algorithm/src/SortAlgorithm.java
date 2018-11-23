/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/9/5
 * @since JDK1.8
 * (1)、插入排序：直接插入排序、二分法插入排序、希尔排序。
 * <p>
 * 　　(2)、选择排序：直接选择排序、堆排序。
 * <p>
 * 　　(3)、交换排序：冒泡排序、快速排序。
 * <p>
 * 　　(4)、归并排序
 * <p>
 * 　　(5)、基数排序
 */
public class SortAlgorithm {

  /**
   * 选择排序
   * <p>
   * 每次选出最大/最小
   */
  private static void select(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int max = arr[i];
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < max) {
          swap(arr, i, j);
        }
      }
    }
    for (int anArr : arr) {
      System.out.print(anArr + ",");
    }
    System.out.println();

  }

  /**
   * 冒泡排序
   * <p>
   * 相邻两个数比较交换
   */
  private static void bubble(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          swap(arr, i, j);
        }
      }
    }
    for (int a : arr) {
      System.out.print(a + ",");
    }
    System.out.println();
  }

  /**
   * 插入排序
   * <p>
   * 将带插入的数插入到排好序的列表
   *
   * @param arr
   */
  private static void insert(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[i] < arr[j]) {
          swap(arr, i, j);
        }
      }
    }
    for (int anArr : arr) {
      System.out.print(anArr + ",");
    }
    System.out.println();
  }

  /**
   * (3)希尔排序
   * <p>
   * 1、基本思想：
   * 先取一个小于n的整数d1作为第一个增量，把文件的全部记录分成d1个组。
   * 所有距离为d1的倍数的记录放在同一个组中。
   * 先在各组内进行直接插入排序；然后，取第二个增量d2
   */
  private static void shell() {

  }

  /**
   * 快速排序
   * <p>
   * 1、基本思想：
   * 选择一个基准元素,通常选择第一个元素或者最后一个元素,
   * 通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,
   * 此时基准元素在其排好序后的正确位置,
   * 然后再用同样的方法递归地排序划分的两部分
   */
  private static void quick(int[] arr) {
    int aim = arr[0];

  }

  private static void swap(int[] arr, int a, int b) {
    arr[a] = arr[a] + arr[b];
    arr[b] = arr[a] - arr[b];
    arr[a] = arr[a] - arr[b];
  }

  public static void main(String[] args) {
    int[] arr = new int[]{ 1, -2, 3, 4, 2, 19, 11 };
    insert(arr);
  }

}
