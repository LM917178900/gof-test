package com.example.demo.patterns.create.builder;

/**
 * @description: Director
 * @author: leiming5
 * @date: 2020-12-30 16:43
 */
public class Director {

    /**
     * 指挥者：调用建造者中的方法完成复杂对象的创建。
     */
    private Builder builder;

    /**
     * 指挥者必须能够指挥建造者
     *
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }


    /**
     * 指挥开始建造
     * 产品构建与组装方法
     *
     * @return
     */
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
