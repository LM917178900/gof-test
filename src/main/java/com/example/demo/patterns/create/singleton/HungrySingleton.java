package com.example.demo.patterns.create.singleton;

/**
 * @description: HungrySingleton
 * @author: leiming5
 * @date: 2020-12-30 13:59
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}
