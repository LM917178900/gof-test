package com.example.demo.patterns.structure.decorator;

/**
 * code reference address:http://c.biancheng.net/view/1359.html
 *
 * @description: DecoratorPattern
 * @author: leiming5
 * @date: 2020-12-30 10:38
 */
public class DecoratorPattern {

    public static void main(String[] args) {

        /**
         * 类加载
         * 从最原始的类开始加载，执行每个类的构造方法
         */
        Component p = new ConcreteComponent();
        Component component = new ConcreteDecorator(p);

        /**
         * 调用方法
         * 从最外层的类开始，同一个类中的方法内部顺序可调整
         */
        component.operation();

    }
}
