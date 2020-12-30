package com.example.demo.patterns.structure.proxy;

/**
 * @description: RealSubject
 * @author: leiming5
 * @date: 2020-12-30 11:33
 */
public class RealSubject implements Subject{
    @Override
    public void Request() {
        System.out.println("real implement");
    }
}
