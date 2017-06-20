package com.wuyi.behavioralPattern.observer;

import java.util.Observable;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class Watched extends Observable{
    private String data="";
    public String retriveData(){
        return data;
    }
    public void changeDate(String data){
        if (!this.data.equals(data)){
            this.data=data;
            setChanged();
        }
        notifyObservers();
    }


}
