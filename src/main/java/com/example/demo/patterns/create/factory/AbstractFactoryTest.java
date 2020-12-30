package com.example.demo.patterns.create.factory;

/**
 * 用于实现 多个工厂生产多种相同类型产品
 *
 * @description: AbstractFactoryTest
 * @author: leiming5
 * @date: 2020-12-30 15:04
 */
public class AbstractFactoryTest {

    /**
     * 工厂1和工厂2,分别都生产了产品a和产品b
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            AbstractFactory factory1 = new ConcreteFactory1();
            Product a = factory1.newProduct1();
            a.show();
            Product b = factory1.newProduct2();
            b.show();

            AbstractFactory factory2 = new ConcreteFactory2();
            Product a1 = factory2.newProduct1();
            a1.show();
            Product b1 = factory2.newProduct2();
            b1.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
