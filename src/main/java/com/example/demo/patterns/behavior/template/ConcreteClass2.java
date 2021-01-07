package com.example.demo.patterns.behavior.template;

/**
 * @description: ConcreteClass2
 * @author: leiming5
 * @date: 2020-12-31 15:39
 */
public class ConcreteClass2 extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法xxxx_1的实现被调用...");
    }
    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法xxxx_2的实现被调用...");
    }
}