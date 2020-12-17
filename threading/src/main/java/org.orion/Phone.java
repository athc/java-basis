package org.orion;

/**
 * TODO
 *
 * @author dujf
 * @version 1.0
 * @date 2020/12/14 11:21
 */

public class Phone {

    private Integer count = 10;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public int countAdd() {
        return count++;
    }
}
