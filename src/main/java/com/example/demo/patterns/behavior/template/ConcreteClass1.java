package com.example.demo.patterns.behavior.template;

/**
 * @description: ConcreteClass
 * @author: leiming5
 * @date: 2020-12-31 15:34
 */
public class ConcreteClass1 extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }
    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
