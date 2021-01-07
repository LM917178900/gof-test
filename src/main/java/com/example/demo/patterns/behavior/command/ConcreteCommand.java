package com.example.demo.patterns.behavior.command;

/**
 * 发命令的人，老板
 *
 * @description: ConcreteCommand
 * @author: leiming5
 * @date: 2020-12-31 16:08
 */
public class ConcreteCommand implements Command {


    private Receiver receiver;
    ConcreteCommand() {
        receiver = new Receiver();
    }

    /**
     * 发命令的人，老板
     * 命令发出者，发命令
     */
    @Override
    public void execute() {
        System.out.println("老板发命令，开始，行动，");
        receiver.action();
    }
}
