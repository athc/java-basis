package com.orion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/19
 * @since JDK1.8
 */

class FirstTest {

    @Test
    @DisplayName("first ")
    public void myFirstTest() {
        try {
            Class a = Class.forName("com.orion.FirstTest");
            FirstTest o = (FirstTest) a.newInstance();
            System.out.println(o);
        } catch (Exception e) {

        }
        assertEquals(2, 1 + 1);
    }


    @Test
    public void test1() {
        ABC a = new ABC();
        a.set1();
        a.set2();
        a.check();
    }

    class ABC {
        private long m = 0L;


        public void set1() {
            m = 0;
        }

        public void set2() {
            m = -1;
        }

        public void check() {
            System.out.println(m);
            if (0 != m && -1 != m) {
                System.err.println("error");
            }
        }
    }
}
