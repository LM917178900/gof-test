package com.example.demo.patterns.create.simpleFactory;

/**
 * @description: SimpleFactory
 * @author: leiming5
 * @date: 2020-12-30 14:46
 */
public class SimpleFactory {

    public static Product makeProduct(int kind) {
        switch (kind) {
            case Client.Const.PRODUCT_A:
                return new ConcreteProduct1();
            case Client.Const.PRODUCT_B:
                return new ConcreteProduct2();
        }
        return null;
    }
}
