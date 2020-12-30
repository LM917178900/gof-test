package com.example.demo.patterns.create.prototype;

/**
 * 深克隆 实现
 *
 * @description: PrototypeTest
 * @author: leiming5
 * @date: 2020-12-30 14:22
 */
public class PrototypeTest {

    /**
     *
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype("xxx");
        System.out.println(obj1.getName());


        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println(obj2.getName());


        System.out.println("obj1==obj2?" + (obj1.equals(obj2)));
        obj1.setName("yyyyyy");
        System.out.println(obj2.getName());
    }
}
