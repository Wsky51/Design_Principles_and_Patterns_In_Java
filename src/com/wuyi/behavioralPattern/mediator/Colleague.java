package com.wuyi.behavioralPattern.mediator;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public abstract class Colleague {
    private Mediator mediator;
    public Colleague(Mediator m){
        mediator=m;
    }
    public Mediator getMediator(){
        return mediator;
    }
    public abstract void action();
    public void change(){
        mediator.colleagueChanged(this);
    }
}
