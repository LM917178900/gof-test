package com.example.demo.patterns.structure.flyweight;

/**
 * @description: FlyweightPatternTest
 * @author: leiming5
 * @date: 2020-12-31 08:55
 */
public class FlyweightPatternTest {

    public static void main(String[] args) {

        /**
         * 相同对象只要保存一份，不会重复创建；
         */
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01 = factory.getFlyweight("a");
        Flyweight f02 = factory.getFlyweight("a");
        Flyweight f03 = factory.getFlyweight("a");
        Flyweight f11 = factory.getFlyweight("b");
        Flyweight f12 = factory.getFlyweight("b");

        /**
         * 不同的东西，被抽出，降级为一个方法，被调用；
         */
        f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
        f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
    }
}
