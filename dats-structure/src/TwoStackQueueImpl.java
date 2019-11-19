import java.util.Stack;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/9/28
 * @since JDK1.8
 * 两个栈实现队列
 */
public class TwoStackQueueImpl<T> {

  private Stack<T> in = new Stack<>();
  private Stack<T> out = new Stack<>();


  private void inputData(T o) {
    in.push(o);
  }

  private T getData() {
    if (out.isEmpty()) {
      if (!in.isEmpty()) {
        in.forEach(data -> out.push(data));
      }
    }
    return !out.isEmpty() ? out.pop() : null;
  }

  public static void main(String[] args) {
    TwoStackQueueImpl<String> queue = new TwoStackQueueImpl<>();
    queue.inputData("name");
    queue.inputData("is");
    queue.inputData("zhangsna");
    System.out.println(queue.getData());
    System.out.println(queue.getData());
    System.out.println(queue.getData());
  }
}
