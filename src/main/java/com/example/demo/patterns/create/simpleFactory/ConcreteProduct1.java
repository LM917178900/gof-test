package com.example.demo.patterns.create.simpleFactory;

/**
 * @description: ConcreteProduct1
 * @author: leiming5
 * @date: 2020-12-30 14:45
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
