package com.example.demo.patterns.behavior.command;

/**
 * @description: CommandPattern
 * @author: leiming5
 * @date: 2020-12-31 16:12
 */
public class CommandPattern {

    public static void main(String[] args) {

        // 发命令的人，老板
        Command cmd = new ConcreteCommand();

        // 客户
        Invoker ir = new Invoker(cmd);


        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }

}
