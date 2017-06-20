package com.wuyi.behavioralPattern.chain;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public class ConcreteHandler extends Handler {
    @Override
    public void handleRequest() {
        if (getSuccessor()!=null){
            System.out.println("The request is passed to "+getSuccessor());
            getSuccessor().handleRequest();
        }
        else{
            System.out.println("The request is handled here");
        }
    }
}
