package com.example.demo.patterns.create.factory;

/**
 * @description: ConcreteFactory2
 * @author: leiming5
 * @date: 2020-12-30 15:03
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct1() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }

    @Override
    public Product newProduct2() {
        System.out.println("具体工厂1生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
