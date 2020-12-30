package com.example.demo.patterns.structure.adapterObject;

import com.example.demo.patterns.structure.adapterClass.Adaptee;

/**
 * @description: ObjectAdapterTest
 * @author: leiming5
 * @date: 2020-12-30 17:58
 */
public class ObjectAdapterTest {

    public static void main(String[] args)
    {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        ObjectAdapter adapter = new ObjectAdapter(adaptee);
        adapter.request();
    }

}
