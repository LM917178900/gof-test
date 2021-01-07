package com.example.demo.patterns.behavior.strategy;

/**
 * @description: ConcreteStrategyA
 * @author: leiming5
 * @date: 2020-12-31 15:48
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
