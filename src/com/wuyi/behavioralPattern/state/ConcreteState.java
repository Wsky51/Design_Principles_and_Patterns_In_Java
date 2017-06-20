package com.wuyi.behavioralPattern.state;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class ConcreteState implements State {
    @Override
    public void sampleOperation() {
        System.out.println("实现sampleOperation()");
    }
}
