package com.example.demo.patterns.create.builder;

/**
 * @description: ConcreteBuilder
 * @author: leiming5
 * @date: 2020-12-30 16:21
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }
    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }
    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}