package com.example.demo.patterns.create.factory;

/**
 * @description: ConcreteProduct1
 * @author: leiming5
 * @date: 2020-12-30 15:00
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
