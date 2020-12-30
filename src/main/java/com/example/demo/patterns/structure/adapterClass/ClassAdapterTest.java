package com.example.demo.patterns.structure.adapterClass;

/**
 * @description: ClassAdapterTest
 * @author: leiming5
 * @date: 2020-12-30 17:54
 */
public class ClassAdapterTest {

    public static void main(String[] args)
    {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }

}
