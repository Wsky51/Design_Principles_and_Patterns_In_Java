package com.wuyi.behavioralPattern.observer;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("具体观察");
    }
}
