package com.example.demo.patterns.structure.composite;

import java.util.ArrayList;

/**
 * @description: Composite
 * @author: leiming5
 * @date: 2020-12-31 12:09
 */
public class Composite implements Component {


    private ArrayList<Component> children = new ArrayList<Component>();


    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    /**
     * 此处会递归处理所有的结构，直到叶子节点
     */
    @Override
    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}
