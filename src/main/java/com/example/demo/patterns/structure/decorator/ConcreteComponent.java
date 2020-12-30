package com.example.demo.patterns.structure.decorator;

/**
 * @description: ConcrateComponent
 * @author: leiming5
 * @date: 2020-12-30 10:59
 */
public class ConcreteComponent implements Component{

    /**
     * todo c1
     */
    public ConcreteComponent(){
        System.out.println("c1 origin constructor without param");
    }

    /**
     * todo m3
     */
    @Override
    public void operation() {
        System.out.println("m3 this is origin");
    }
}
