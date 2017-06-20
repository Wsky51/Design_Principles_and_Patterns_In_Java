package com.wuyi.behavioralPattern.memento;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state=state;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
