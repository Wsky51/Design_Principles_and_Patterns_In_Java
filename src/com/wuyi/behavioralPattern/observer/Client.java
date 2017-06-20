package com.wuyi.behavioralPattern.observer;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class Client {
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        Observer observer=new ConcreteObserver();
        Observer observer1=new ConcreteObserver();
        subject.attach(observer);
        subject.attach(observer1);
        subject.notifyObservers();
    }
}
