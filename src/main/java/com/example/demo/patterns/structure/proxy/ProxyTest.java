package com.example.demo.patterns.structure.proxy;

/**
 * 客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性。
 *
 * @description: ProxyTest
 * @author: leiming5
 * @date: 2020-12-30 11:39
 */
public class ProxyTest {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.Request();
    }
}
