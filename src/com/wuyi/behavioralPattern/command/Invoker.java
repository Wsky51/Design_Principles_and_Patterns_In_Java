package com.wuyi.behavioralPattern.command;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
