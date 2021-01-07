package com.example.demo.patterns.behavior.strategy;

/**
 * @description: Context
 * @author: leiming5
 * @date: 2020-12-31 15:50
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 有代理的味道
     */
    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
