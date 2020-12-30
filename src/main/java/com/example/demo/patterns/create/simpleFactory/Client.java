package com.example.demo.patterns.create.simpleFactory;

/**
 * 简单工厂模式中创建实例的方法通常为静态（static）方法，
 * 因此简单工厂模式（Simple Factory Pattern）又叫作静态工厂方法模式（Static Factory Method Pattern）。
 *
 * @description: Client
 * @author: leiming5
 * @date: 2020-12-30 14:43
 */
public class Client {

    /**
     * 静态工厂SimpleFactory，生产产品a和产品b
     *
     * @param args
     */
    public static void main(String[] args) {

        Product product = SimpleFactory.makeProduct(Const.PRODUCT_A);
        product.show();

        Product product1 = SimpleFactory.makeProduct(Const.PRODUCT_B);
        product1.show();
    }

    final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

}
