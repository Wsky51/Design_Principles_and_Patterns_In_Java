package com.wuyi.behavioralPattern.command;

/**
 * Created on 2017/6/18
         *
         * @author WuYi
        */
public class Client {
    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Command command=new ConcreteCommand(receiver);
        Invoker invoker=new Invoker(command);
        invoker.action();
    }
}
