package com.example.demo.patterns.behavior.strategy;

/**
 * @description: ConcreteStrategyB
 * @author: leiming5
 * @date: 2020-12-31 15:49
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
