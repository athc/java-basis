import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/9/2
 * @since JDK1.8
 */
public class CollectionAndMap {

  private static void queue() {
    Queue<String> queue = new ArrayDeque<>();
    queue.offer("zhangsan");
    queue.offer("lisi");
    queue.offer("wangwu");
    queue.peek();
    queue.poll();
    System.out.println(queue);
  }

  private static void set() {
    Set<String> hashSet = new HashSet<String>();
    hashSet.add("cca");
    hashSet.add("acb");
    hashSet.add("bba");
    System.out.println(hashSet.toString());
    //元素添加：
    Set<String> treeSet = new TreeSet<String>();
    treeSet.add("acb");
    treeSet.add("bba");
    treeSet.add("cca");
    treeSet.add("my");
    treeSet.add("name");
    treeSet.add("jiaboyan");
    treeSet.add("hello");
    treeSet.add("world");
    treeSet.add("1");
    treeSet.add("2");
    treeSet.add("3");
    System.out.println("TreeSet容量大小：" + treeSet.size());
    System.out.println("TreeSet元素顺序为：" + treeSet.toString());

    //遍历
    //foreach
    treeSet.forEach(
        System.out::println
    );
    for (String aTreeSet : treeSet) {
      System.out.println(aTreeSet);
    }
    //迭代器遍历
    Iterator<String> stringIterator = treeSet.iterator();
    while (stringIterator.hasNext()) {
      System.out.println(stringIterator.next());
    }
    System.out.println("删除并返回第一个元素：" + ((TreeSet<String>) treeSet).pollFirst());
    System.out.println("删除并返回最后一个元素：" + ((TreeSet<String>) treeSet).pollLast());
    System.out.println("第一个元素是：" + ((TreeSet<String>) treeSet).first());
    treeSet.clear();//清空元素
  }

  private static void list() {
    List list = new ArrayList();
//    list=new LinkedList();
//    list =Collections.synchronizedList(new ArrayList<>());
    for (int i = 0; i < 100000; i++) {
      list.add(String.valueOf(i));
    }
    final Object[] a = { 0 };
    System.out.println(list.toArray());
    long start = System.currentTimeMillis();
    for (int i = 0; i < list.size(); i++) {
      a[0] = list.get(i);
    }
    System.out.println("for  cost time ms------ : " + (System.currentTimeMillis() - start));

    start = System.currentTimeMillis();
    for (int i = 0, m = list.size(); i < m; i++) {
      a[0] = list.get(i);
    }
    System.out.println("for优化 cost time ms------ : " + (System.currentTimeMillis() - start));

    start = System.currentTimeMillis();
    list.forEach(s ->
        a[0] = s
    );
    System.out.println("foreach cost time ms------ : " + (System.currentTimeMillis() - start));

    start = System.currentTimeMillis();
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      a[0] = iterator.next();
    }
    System.out.println("iterator cost time ms------ : " + (System.currentTimeMillis() - start));
  }

  private static void linkList() {
    //创建存放int类型的linkedList
    LinkedList<Integer> linkedList = new LinkedList<>();
    /************************** linkedList的基本操作 ************************/
    linkedList.addFirst(0); // 添加元素到列表开头
    linkedList.add(1); // 在列表结尾添加元素
    linkedList.add(2, 2); // 在指定位置添加元素
    linkedList.addLast(3); // 添加元素到列表结尾

    System.out.println("LinkedList（直接输出的）: " + linkedList);

    System.out.println("getFirst()获得第一个元素: " + linkedList.getFirst()); // 返回此列表的第一个元素
    System.out.println("getLast()获得第最后一个元素: " + linkedList.getLast()); // 返回此列表的最后一个元素
    System.out.println("removeFirst()删除第一个元素并返回: " + linkedList.removeFirst()); // 移除并返回此列表的第一个元素
    System.out.println("removeLast()删除最后一个元素并返回: " + linkedList.removeLast()); // 移除并返回此列表的最后一个元素
    System.out.println("After remove:" + linkedList);
    System.out.println("contains()方法判断列表是否包含1这个元素:" + linkedList.contains(1)); // 判断此列表包含指定元素，如果是，则返回true
    System.out.println("该linkedList的大小 : " + linkedList.size()); // 返回此列表的元素个数

    /************************** 位置访问操作 ************************/
    System.out.println("-----------------------------------------");
    linkedList.set(1, 3); // 将此列表中指定位置的元素替换为指定的元素
    System.out.println("After set(1, 3):" + linkedList);
    System.out.println("get(1)获得指定位置（这里为1）的元素: " + linkedList.get(1)); // 返回此列表中指定位置处的元素

    /************************** Search操作 ************************/
    System.out.println("-----------------------------------------");
    linkedList.add(3);
    System.out.println("indexOf(3): " + linkedList.indexOf(3)); // 返回此列表中首次出现的指定元素的索引
    System.out.println("lastIndexOf(3): " + linkedList.lastIndexOf(3));// 返回此列表中最后出现的指定元素的索引

    /************************** Queue操作 ************************/
    System.out.println("-----------------------------------------");
    System.out.println("peek(): " + linkedList.peek()); // 获取但不移除此列表的头
    System.out.println("element(): " + linkedList.element()); // 获取但不移除此列表的头
    linkedList.poll(); // 获取并移除此列表的头
    System.out.println("After poll():" + linkedList);
    linkedList.remove();
    System.out.println("After remove():" + linkedList); // 获取并移除此列表的头
    linkedList.offer(4);
    System.out.println("After offer(4):" + linkedList); // 将指定元素添加到此列表的末尾

    /************************** Deque操作 ************************/
    System.out.println("-----------------------------------------");
    linkedList.offerFirst(2); // 在此列表的开头插入指定的元素
    System.out.println("After offerFirst(2):" + linkedList);
    linkedList.offerLast(5); // 在此列表末尾插入指定的元素
    System.out.println("After offerLast(5):" + linkedList);
    System.out.println("peekFirst(): " + linkedList.peekFirst()); // 获取但不移除此列表的第一个元素
    System.out.println("peekLast(): " + linkedList.peekLast()); // 获取但不移除此列表的第一个元素
    linkedList.pollFirst(); // 获取并移除此列表的第一个元素
    System.out.println("After pollFirst():" + linkedList);
    linkedList.pollLast(); // 获取并移除此列表的最后一个元素
    System.out.println("After pollLast():" + linkedList);
    linkedList.push(2); // 将元素推入此列表所表示的堆栈（插入到列表的头）
    System.out.println("After push(2):" + linkedList);
    linkedList.pop(); // 从此列表所表示的堆栈处弹出一个元素（获取并移除列表第一个元素）
    System.out.println("After pop():" + linkedList);
    linkedList.add(3);
    linkedList.removeFirstOccurrence(3); // 从此列表中移除第一次出现的指定元素（从头部到尾部遍历列表）
    System.out.println("After removeFirstOccurrence(3):" + linkedList);
    linkedList.removeLastOccurrence(3); // 从此列表中移除最后一次出现的指定元素（从头部到尾部遍历列表）
    System.out.println("After removeFirstOccurrence(3):" + linkedList);

    /************************** 遍历操作 ************************/
    System.out.println("-----------------------------------------");
    linkedList.clear();
    for (int i = 0; i < 100000; i++) {
      linkedList.add(i);
    }
    // 迭代器遍历
    long start = System.currentTimeMillis();
    Iterator<Integer> iterator = linkedList.iterator();
    while (iterator.hasNext()) {
      iterator.next();
    }
    long end = System.currentTimeMillis();
    System.out.println("Iterator：" + (end - start) + " ms");

    // 顺序遍历(随机遍历)
    start = System.currentTimeMillis();
    for (int i = 0; i < linkedList.size(); i++) {
      linkedList.get(i);
    }
    end = System.currentTimeMillis();
    System.out.println("for：" + (end - start) + " ms");

    // 另一种for循环遍历
    start = System.currentTimeMillis();
    for (Integer i : linkedList) {

    }
    end = System.currentTimeMillis();
    System.out.println("for2：" + (end - start) + " ms");

    // 通过pollFirst()或pollLast()来遍历LinkedList
    LinkedList<Integer> temp1 = new LinkedList<>();
    temp1.addAll(linkedList);
    start = System.currentTimeMillis();
    while (temp1.size() != 0) {
      temp1.pollFirst();
    }
    end = System.currentTimeMillis();
    System.out.println("pollFirst()或pollLast()：" + (end - start) + " ms");

    // 通过removeFirst()或removeLast()来遍历LinkedList
    LinkedList<Integer> temp2 = new LinkedList<>();
    temp2.addAll(linkedList);
    start = System.currentTimeMillis();
    while (temp2.size() != 0) {
      temp2.removeFirst();
    }
    end = System.currentTimeMillis();
    System.out.println("removeFirst()或removeLast()：" + (end - start) + " ms");
  }

  private static void stack() {
    Stack<String> stack = new Stack<>();
    stack.push("h");
    stack.push("e");
    stack.push("l");
    stack.push("l");
    stack.push("o");
    System.out.println(stack.toString());
    System.out.println(stack.peek());
    System.out.println(stack.toString());
    System.out.println(stack.pop());
    System.out.println(stack.toString());
    System.out.println(stack.empty());
    System.out.println(stack.search("l"));
    //遍历
    Enumeration enumeration = stack.elements();
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }
    stack.forEach(System.out::println);
    stack.clear();
  }

  private static void hashMap() {
    HashMap<String, String> map = new HashMap<String, String>();
    // 键不能重复，值可以重复
    map.put("san", "张三");
    map.put("si", "李四");
    map.put("wu", "王五");
    map.put("wang", "老王");
    map.put("wang", "老王2");// 老王被覆盖
    map.put("lao", "老王");
    System.out.println("-------直接输出hashmap:-------");
    System.out.println(map);
    /**
     * 遍历HashMap
     */
    // 1.获取Map中的所有键
    System.out.println("-------foreach获取Map中所有的键:-----------------------");
    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.print(key + "  ");
    }
    System.out.println();//换行
    // 2.获取Map中所有值
    System.out.println("-------foreach获取Map中所有的值:------------------------");
    Collection<String> values = map.values();
    for (String value : values) {
      System.out.println(value + "  ");
    }
    System.out.println();//换行
    // 3.得到key的值的同时得到key所对应的值
    System.out.println("-------得到key的值的同时得到key所对应的值:----------------");
    Set<String> keys2 = map.keySet();
    for (String key : keys2) {
      System.out.println(key + "：" + map.get(key) + "   ");

    }
    /**
     * 另外一种不常用的遍历方式
     */
    // 当我调用put(key,value)方法的时候，首先会把key和value封装到
    // Entry这个静态内部类对象中，把Entry对象再添加到数组中，所以我们想获取
    // map中的所有键值对，我们只要获取数组中的所有Entry对象，接下来
    // 调用Entry对象中的getKey()和getValue()方法就能获取键值对了
    System.out.println("entry 循环-----------------------------");
    Set<java.util.Map.Entry<String, String>> entrys = map.entrySet();
    for (Map.Entry<String, String> entry : entrys) {
      System.out.println(entry.getKey() + "--" + entry.getValue());
    }

    // 4.得到key的值的同时得到key所对应的值
    System.out.println("lamda 循环------------------");
    map.forEach((k, v) ->
        System.out.println(k + ":" + v)
    );
    /**
     * HashMap其他常用方法
     */
    System.out.println("after map.size()：" + map.size());
    System.out.println("after map.isEmpty()：" + map.isEmpty());
    System.out.println(map.remove("san"));
    System.out.println("after map.remove()：" + map);
    System.out.println("after map.get(si)：" + map.get("si"));
    System.out.println("after map.containsKey(si)：" + map.containsKey("si"));
    System.out.println("after containsValue(李四)：" + map.containsValue("李四"));
    System.out.println(map.replace("si", "李四2"));
    System.out.println("after map.replace(si, 李四2):" + map);
  }

  private static void hashTable() {
    Hashtable hashtable = new Hashtable();
    hashtable.put("zhngasn", "aaaaa");
  }

  private static void concurrentHashMap() {
    ConcurrentHashMap map = new ConcurrentHashMap<>();
    map.put("abc", "aac");


  }

  public static void main(String[] args) {
    hashMap();
  }
}
