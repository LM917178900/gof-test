package com.example.demo.patterns.create.prototype;

/**
 * 深度复制，复制成功：每个属性的值相同，但是引用不用；
 *
 * @description: Realizetype
 * @author: leiming5
 * @date: 2020-12-30 14:19
 */
public class Realizetype implements Cloneable{

    private String name;

    Realizetype (String name){
        this.name = name;
        System.out.println("构建成功！");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return super.clone();
    }
}
