package com.example.demo.patterns.structure.bridge;

/**
 * 抽象化角色
 *
 * @description: Abstraction
 * @author: leiming5
 * @date: 2020-12-30 18:10
 */
public abstract class Abstraction {


    protected Implementor implementor;
    protected Abstraction(Implementor imple) {
        this.implementor = imple;
    }

    /**
     * 扩展方法
     */
    public abstract void Operation();
}
