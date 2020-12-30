package com.example.demo.patterns.structure.adapterObject;

import com.example.demo.patterns.structure.adapterClass.Adaptee;

/**
 * @description: ObjectAdapter
 * @author: leiming5
 * @date: 2020-12-30 17:56
 */
public class ObjectAdapter {

    /**
     * 依赖对象，而不是继承对象
     */
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }



    public void request()
    {
        adaptee.specificRequest();
    }
}
