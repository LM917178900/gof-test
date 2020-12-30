package com.example.demo.patterns.structure.proxy;

/**
 * @description: Proxy
 * @author: leiming5
 * @date: 2020-12-30 11:34
 */
public class Proxy implements Subject{

    private RealSubject realSubject;

    /**
     * 此类为代理类
     * 此方法为代理方法:帮你做好你原来想做的事，同时帮你处理其他非必须的事；
     *
     */
    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();

        // 你原来想做的事
        realSubject.Request();

        postRequest();
    }

    /**
     * 非必须的事
     */
    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    /**
     * 非必须的事
     */
    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
