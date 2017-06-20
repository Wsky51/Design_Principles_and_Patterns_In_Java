package com.wuyi.behavioralPattern.observer;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyObservers();
}
