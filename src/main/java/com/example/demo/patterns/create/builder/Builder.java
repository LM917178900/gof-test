package com.example.demo.patterns.create.builder;

/**
 * 抽象建造者：包含创建产品各个子部件的抽象方法。
 *
 * @description: Builder
 * @author: leiming5
 * @date: 2020-12-30 16:20
 */
public abstract class Builder {

    //创建new产品对象
    protected Product product = new Product();

    /**
     * 建造部件
     */
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    /**
     * 建造完成，返回产品对象
     *
     * @return
     */
    public Product getResult() {
        return product;
    }
}
