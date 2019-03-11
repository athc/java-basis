package org.orion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/11/23
 * @since JDK1.8
 */
public class HelloStream {


  public static List<String> stringList() {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < 10000; i++) {
      list.add(String.valueOf(i));
    }
    return list;
  }

  public static List intList() {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10000; i++) {
      list.add(i);
    }
    return list;
  }

  public static void main(String[] args) {
    //流循环
    Long start = System.currentTimeMillis();
    stringList().parallelStream().forEach(
        System.out::print
    );
    System.out.println("\n");
    System.out.println(System.currentTimeMillis() - start);

    //foreach 循环
    System.out.println("\n");
    start = System.currentTimeMillis();
    stringList().forEach(System.out::print);
    System.out.println("\n");
    System.out.println(System.currentTimeMillis() - start);

    //stream 转换大小写
    stringList().stream().map(String::toUpperCase);
    List object = stringList().stream().map(String::toUpperCase).distinct().collect(Collectors.toCollection(ArrayList::new));
    System.out.println(object);

    Object list = intList().stream().filter(num -> Integer.valueOf(num.toString()) % 200 == 0).collect(Collectors.toCollection(ArrayList::new));
    System.out.println(object);

    List<Person> personList = new ArrayList<>();
    Person person = null;
    for (int i = 0; i < 100; i++) {
      person = new Person(String.valueOf(i), i);
      personList.add(person);
    }

    List<Person> personList1 = personList.stream().distinct().filter(person1 -> person1.age > 34).collect(Collectors.toCollection(ArrayList::new));
    System.out.println(personList1);
  }


  static class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }
  }
}
