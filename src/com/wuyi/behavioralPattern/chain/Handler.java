package com.wuyi.behavioralPattern.chain;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public abstract class Handler {
    protected Handler successor;
    public abstract void handleRequest();
    public void setSuccessor(Handler successor){
        this.successor=successor;
    }
    public Handler getSuccessor(){
        return successor;
    }
}
