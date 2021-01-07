package com.example.demo.patterns.behavior.template;

/**
 * @description: TemplateMethodPatternTest
 * @author: leiming5
 * @date: 2020-12-31 15:33
 */
public class TemplateMethodPatternTest {

    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass1();
        tm.TemplateMethod();

        AbstractClass concreteClass = new ConcreteClass2();
        concreteClass.TemplateMethod();
    }

}
