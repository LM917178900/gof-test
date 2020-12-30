package com.example.demo.patterns.structure.adapterClass;

/**
 * @description: ClassAdapter
 * @author: leiming5
 * @date: 2020-12-30 17:53
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request()
    {
        specificRequest();
    }
}
