package org.orion;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-01
 * @since JDK1.8
 */
public class MyQueue {
  private Queue killQueue = new ConcurrentLinkedQueue<Long>();

  public void kill(Long memberId) {
    if (killQueue.contains(memberId)) {
      System.out.println(new StringBuffer(memberId.toString()).append(" exisit").toString());
      return;
    }
    if (killQueue.size() > 2) {
      System.out.println(new StringBuffer("kill").append(" over").toString());
      return;
    }
    killQueue.add(memberId);
    System.out.println("add memberId :" + memberId);
  }

  public void save() {
    System.out.println(killQueue.poll());
  }

  public static void main(String[] args) {
    int i = 10000;
    MyQueue myQueue = new MyQueue();
    System.out.println(myQueue.killQueue.size());
    for (int j = 0; j <= 10; j++) {
      while (i > 0) {
        Thread thread = new Thread(
            () -> myQueue.kill(new Random().nextLong()));
        thread.start();
        i--;
        System.out.println(Thread.activeCount());
      }
    }
  }
}
