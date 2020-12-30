package com.example.demo.patterns.structure.bridge;

/**
 * 扩展抽象化角色
 *
 * @description: RefinedAbstraction
 * @author: leiming5
 * @date: 2020-12-30 18:12
 */
public class RefinedAbstraction extends Abstraction {

    /**
     * 抽象的注入对象（抽出了公共部分）
     *
     * @param imple
     */
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    /**
     * 扩展方法
     * 使用的时候，还扩展了原来的方法
     */
    @Override
    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        implementor.OperationImpl();
    }
}
