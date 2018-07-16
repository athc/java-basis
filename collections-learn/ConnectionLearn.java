import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/16
 * @since JDK1.8
 */
public class ConnectionLearn {

  //list 常用实现类 array list  link list
  private static void list() {
    List<String> list = new ArrayList<>();
    //添加
    list.add("aaa");
    //删除remove 移除失败返回false
    System.out.println(list.remove("aaaa"));

    //stack
    Stack<String> stringStack = new Stack<>();
    //添加一个元素 压栈
    stringStack.push("abnbc");
    //判断是否为空
    stringStack.empty();
    //返回栈顶元素
    stringStack.peek();
    //取出栈顶元素
    System.out.println(stringStack.pop());
  }


  /**
   * set 常用实现类 hashset 和 treeset
   * <p>
   * <p>
   * <p>
   * add( )         向集合中添加元素
   * clear( )        去掉集合中所有的元素
   * contains( )    判断集合中是否包含某一个元素
   * isEmpty( )    判断集合是否为空
   * iterator( )    主要用于递归集合，返回一个Iterator()对象
   * remove( )    从集合中去掉特定的对象
   * size( )        返回集合的大小
   */
  private static void set() {
    Set<String> stringSet = new HashSet<>();

    //set 通过equals和 hashcode 判断元素是否重复
    //add 添加一个元素
    stringSet.add("abn");

    //判断集合是否为空
    if (!stringSet.isEmpty()) {
      for (String aStringSet : stringSet) {
        //contains 判断集合是否包含某个元素
        if (stringSet.contains("abn")) {
          System.out.println(aStringSet);
        }
      }
    }

    //清除所有元素
    stringSet.clear();
  }

  /**
   * queue
   * <p>
   * <p>
   * 　　remove   移除并返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException异常
   * 　poll         移除并返问队列头部的元素    如果队列为空，则返回null
   * add        增加一个元索                     如果队列已满，则抛出一个IIIegaISlabEepeplian异常
   * 　　offer       添加一个元素并返回true       如果队列已满，则返回false
   * element  返回队列头部的元素             如果队列为空，则抛出一个NoSuchElementException异常
   * 　　peek       返回队列头部的元素             如果队列为空，则返回null
   */
  public static void queue() {

    Queue<String> strings = new PriorityQueue<>();

    //poll 获取并移除队首元素 获取失败返回空
    System.out.println(strings.poll());
    //remove 移除并返回对首元素 失败抛异常
    try {
      System.out.println(strings.remove());
    } catch (Exception e) {
      System.out.println("队列为空");
    }

    try {
      //element获取队首元素 不存在跑出异常
      System.out.println(strings.element());
    } catch (Exception e) {
      System.out.println("对列为空");
    }
    //peek 获取队首元素 不存在则返回空
    System.out.println(strings.peek());

    //offer 添加一个元素并返回ture 添加失败返回false
    if (strings.offer("annvan")) {
      System.out.println("添加成功");
    }
    //add 添加一个元素，添加失败抛异常
    try {
      strings.add("abg");
    } catch (Exception e) {
      System.out.println("add 添加失败");
    }
  }

  //map 常用实现类 hashmap hashtable treemap linkedhashmap
  private static void map() {
    Map<String, String> map = new HashMap<>();
    //添加元素
    map.put("key", "value");
    map.put("key2", "value");
    map.put("key3", "value");
    //map 的遍历
    //1. 两次取值
    for (String key : map.keySet()) {
      //获取元素
      System.out.println(key + ":" + map.get(key));
    }
    //2. entryset
    for (Map.Entry entry : map.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
    //3. lamda
    map.forEach((String k, String v) -> {
      System.out.println(k + ":" + v);
    });
    map.remove("key");
    //清空map
    map.clear();
  }

  public static void main(String[] args) {
    map();
  }
}
