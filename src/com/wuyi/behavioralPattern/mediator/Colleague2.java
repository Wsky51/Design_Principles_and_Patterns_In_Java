package com.wuyi.behavioralPattern.mediator;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class Colleague2 extends Colleague {
    public Colleague2(Mediator m){
        super(m);
    }

    @Override
    public void action() {
        System.out.println("This is an action from Colleague2");
    }
}
