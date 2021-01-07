package com.example.demo.patterns.structure.flyweight;

/**
 * 具体享元角色
 *
 * @description: ConcreteFlyweight
 * @author: leiming5
 * @date: 2020-12-31 08:52
 */
public class ConcreteFlyweight implements Flyweight {

    private String key;
    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    /**
     * 将非公用的信息分离出去，再重新组装
     *
     * @param outState
     */
    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + outState.getInfo());
    }
}
