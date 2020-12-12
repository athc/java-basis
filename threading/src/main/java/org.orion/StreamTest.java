package org.orion;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author dujf
 * @version 1.0
 * @date 2020/12/12 16:08
 */

public class StreamTest {


    @Test
    public void testParallelStream() {
        List<Runnable> jobs = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>() {{
            for (int i = 0; i < 100; i++) {
                int finalI = i;
                jobs.add(() -> {
                    System.out.println(Thread.currentThread().getName() + "===" + finalI + "正在执行======" + "");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    add(finalI);
                });
            }
        }};


        jobs.parallelStream().forEach(Runnable::run);
        Assert.assertEquals(100, numbers.size());
    }
}
