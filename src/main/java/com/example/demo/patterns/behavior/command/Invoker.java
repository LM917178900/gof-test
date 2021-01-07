package com.example.demo.patterns.behavior.command;

/**
 * 调用者，客户
 *
 * @description: Invoker
 * @author: leiming5
 * @date: 2020-12-31 16:10
 */
public class Invoker {

    private Command command;
    public Invoker(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 客户调用命令
     */
    public void call() {
        System.out.println("客户调用命令， 调用者执行命令command...");
        command.execute();
    }

}
