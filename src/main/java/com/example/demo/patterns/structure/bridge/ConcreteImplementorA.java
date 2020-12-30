package com.example.demo.patterns.structure.bridge;

/**
 * 具体实现化角色
 *
 * @description: ConcreteImplementorA
 * @author: leiming5
 * @date: 2020-12-30 18:10
 */
public class ConcreteImplementorA implements Implementor {


    /**
     * 具体实现对象，具体实现方法
     */
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
