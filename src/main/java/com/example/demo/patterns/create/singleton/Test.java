package com.example.demo.patterns.create.singleton;

/**
 * @description: Test
 * @author: leiming5
 * @date: 2020-12-30 14:08
 */
public class Test {

    /**
     * 设置总统这个职位只能由一个人担任
     *
     * @param args
     */
    public static void main(String[] args) {
        President zt1 = President.getInstance();
        zt1.getName();    //输出总统的名字
        President zt2 = President.getInstance();
        zt2.getName();    //输出总统的名字
        if (zt1 == zt2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
    }
}
