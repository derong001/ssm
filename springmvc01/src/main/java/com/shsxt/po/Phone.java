package com.shsxt.po;

/**
 * Created by xlf on 2019/4/13.
 */
public class Phone {
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "num=" + num +
                '}';
    }
}
