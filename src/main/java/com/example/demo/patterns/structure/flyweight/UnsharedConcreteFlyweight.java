package com.example.demo.patterns.structure.flyweight;

/**
 * 非享元角色，它以参数的形式注入具体享元的相关方法中。
 *
 * @description: UnsharedConcreteFlyweight
 * @author: leiming5
 * @date: 2020-12-31 08:51
 */
public class UnsharedConcreteFlyweight {

    private String info;
    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
