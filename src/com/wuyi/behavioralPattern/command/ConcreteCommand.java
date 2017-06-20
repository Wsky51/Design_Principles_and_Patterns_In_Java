package com.wuyi.behavioralPattern.command;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;
    public ConcreteCommand(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
