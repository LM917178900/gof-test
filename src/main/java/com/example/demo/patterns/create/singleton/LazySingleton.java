package com.example.demo.patterns.create.singleton;

/**
 * @description: LazySingleton
 * @author: leiming5
 * @date: 2020-12-30 13:56
 */
public class LazySingleton {

    // 保证 instance 在所有线程中同步
    private static volatile LazySingleton instance = null;

    // private 避免类在外部被实例化
    private LazySingleton() {
    }

        // getInstance 方法前加同步
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
