package com.example.demo.patterns.create.factory;

/**
 * @description: AbstractFactoryTest
 * @author: leiming5
 * @date: 2020-12-30 15:04
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        try {
            AbstractFactory af = new ConcreteFactory1();

            Product a = af.newProduct1();
            a.show();


            Product b = af.newProduct2();
            b.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
