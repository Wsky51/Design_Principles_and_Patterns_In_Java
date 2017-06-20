package com.wuyi.behavioralPattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class ConcreteSubject implements Subject {
    private Vector observersVector=new Vector();

    @Override
    public void attach(Observer observer) {
        observersVector.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observersVector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()){
            ((Observer)(enumeration.nextElement())).update();
        }
    }
    public Enumeration observers(){
        return ((Vector)observersVector.clone()).elements();
    }
}
