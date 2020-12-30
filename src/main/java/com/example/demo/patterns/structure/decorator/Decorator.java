package com.example.demo.patterns.structure.decorator;

/**
 * @description: Decorator
 * @author: leiming5
 * @date: 2020-12-30 10:43
 */
public class Decorator implements Component{

    private Component component;

    /**
     * 构造方法
     * 注入原始接口
     * 没有返回类型
     * todo c2
     *
     * @param component
     */
    public Decorator(Component component){
        this.component = component;
        System.out.println("c2 first time decoration");
    }

    /**
     * 对接口，使用实现进行包装
     * 方法还是原来的接口
     * todo m2
     */
    @Override
    public void operation() {
        System.out.println("m2 first time decoration");
       component.operation();
    }
}
