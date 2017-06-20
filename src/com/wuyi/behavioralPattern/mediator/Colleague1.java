package com.wuyi.behavioralPattern.mediator;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class Colleague1 extends Colleague {
    public Colleague1(Mediator m) {
        super(m);
    }
    //具体的实现方法

    @Override
    public void action() {
        System.out.println("This is an action from Colleague1");
    }
}
