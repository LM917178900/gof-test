package com.example.demo.patterns.behavior.strategy;

/**
 * @description: StrategyPatternTest
 * @author: leiming5
 * @date: 2020-12-31 15:51
 */
public class StrategyPatternTest {

    public static void main(String[] args) {
        Context c = new Context();

        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();

        System.out.println("-----------------");


        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }

}
