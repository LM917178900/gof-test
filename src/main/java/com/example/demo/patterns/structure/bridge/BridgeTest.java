package com.example.demo.patterns.structure.bridge;

/**
 * @description: BridgeTest
 * @author: leiming5
 * @date: 2020-12-30 18:13
 */
public class BridgeTest {

    public static void main(String[] args) {

        // 创建实例化对象
        Implementor imple = new ConcreteImplementorA();

        // 注入实例化对象
        Abstraction abs = new RefinedAbstraction(imple);

        // 调用扩展方法
        abs.Operation();
    }
}
