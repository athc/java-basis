package org.orion;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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
        AtomicInteger count = new AtomicInteger();
        List<Runnable> jobs = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            jobs.add(() -> {
                count.getAndIncrement();
                System.out.println(Thread.currentThread().getName() + "===" + count + "正在执行======" + "");
            });
        }
        jobs.parallelStream().forEach(Runnable::run);
        Assert.assertEquals(100, count.get());
    }
}
