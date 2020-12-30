package com.example.demo.patterns.structure.decorator;

/**
 * @description: ConcreteDecorator
 * @author: leiming5
 * @date: 2020-12-30 10:48
 */
public class ConcreteDecorator extends Decorator{

    /**
     * super 必须放在第一行
     *
     * @param component
     */
    public ConcreteDecorator(Component component){

        super(component);
        System.out.println("c3 second time decoration!");//4
    }

    /**
     * 具体装饰接口方法
     * todo m1
     */
    @Override
    public void operation() {
        System.out.println("m1 second time decoration!");
        super.operation();
        addedFunction();
    }

    /**
     * todo m4
     */
    public void addedFunction() {
        System.out.println("m4 second time decoration!");
    }
}
