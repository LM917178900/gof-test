package com.example.demo.patterns.create.builder;

/**
 * 具体建造者：实现了抽象建造者接口。
 *
 * @description: ConcreteBuilder
 * @author: leiming5
 * @date: 2020-12-30 16:21
 */
public class ConcreteBuilder extends Builder {

    /**
     * 实际建造者，建造产品的具体部件
     */
    @Override
    public void buildPartA() {
        System.out.println(" build part A");
        product.setPartA("建造 PartA");
    }
    @Override
    public void buildPartB() {
        System.out.println(" build part B");
        product.setPartB("建造 PartB");
    }
    @Override
    public void buildPartC() {
        System.out.println(" build part C");
        product.setPartC("建造 PartC");
    }
}
