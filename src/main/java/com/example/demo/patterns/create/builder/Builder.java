package com.example.demo.patterns.create.builder;

/**
 * @description: Builder
 * @author: leiming5
 * @date: 2020-12-30 16:20
 */
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult() {
        return product;
    }
}
