package com.wuyi.behavioralPattern.mediator;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public abstract class Mediator {
    public abstract void colleagueChanged(Colleague c);

    public static void main(String[] args) {
        ConcreteMediator mediator=new ConcreteMediator();
        mediator.createConcreteMediator();
        mediator.colleagueChanged(new Colleague1(new ConcreteMediator()));
    }
}
