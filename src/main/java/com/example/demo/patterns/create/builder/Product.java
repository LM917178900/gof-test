package com.example.demo.patterns.create.builder;

/**
 * 产品角色：包含多个组成部件的复杂对象。
 *
 * @description: Product
 * @author: leiming5
 * @date: 2020-12-30 16:19
 */
public class Product {

    private String partA;
    private String partB;
    private String partC;
    public void setPartA(String partA) {
        this.partA = partA;
    }
    public void setPartB(String partB) {
        this.partB = partB;
    }
    public void setPartC(String partC) {
        this.partC = partC;
    }
    public void show() {
        //显示产品的特性
        System.out.println("partA:" + this.partA +
                ", partB:" + this.partB +
                ", partC:" + this.partC);
        System.out.println("显示产品特性");
    }
}
