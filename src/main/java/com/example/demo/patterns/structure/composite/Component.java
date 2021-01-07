package com.example.demo.patterns.structure.composite;

/**
 * @description: Component
 * @author: leiming5
 * @date: 2020-12-31 12:07
 */
public interface Component {

    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i);
    public void operation();
}
