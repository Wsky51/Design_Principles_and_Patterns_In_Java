package com.wuyi.behavioralPattern.observer;

import java.util.*;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class Watcher implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Data has been changed to : "+((Watched)o).retriveData());
    }
    public Watcher(Watched w){
        w.addObserver(this);
    }
}
