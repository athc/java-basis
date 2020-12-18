package org.orion.finalkey;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/10/12
 * @since JDK1.8
 */
public final class FinalKey {

  private final int num = 0;

  private final static People people = new People("zhangsan", 20);

  public final int getNumber() {
    return num;
  }

  public final int getNumber(int inputNum) {
    return inputNum;
  }

  static class People {
    private String name;
    private int age;

    private People(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args) {
    System.out.println(people.name);
    people.name = "lisi";
    people.age = 22;
    System.out.println(people.age);
  }
}

