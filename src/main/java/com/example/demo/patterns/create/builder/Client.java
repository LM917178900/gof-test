package com.example.demo.patterns.create.builder;

/**
 * @description: Client
 * @author: leiming5
 * @date: 2020-12-30 16:45
 */
public class Client {

    public static void main(String[] args) {

        // 建造者，具有建造部件的方法；
        Builder builder = new ConcreteBuilder();

        // 指挥者，建造的时候，指挥建造者具体操作
        Director director = new Director(builder);

        // 指挥者，指挥建造，生产产品；
        Product product = director.construct();

        // 展示产品；
        product.show();
    }
}
