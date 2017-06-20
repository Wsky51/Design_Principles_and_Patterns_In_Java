package com.wuyi.behavioralPattern.state;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class Context {
    private State state;
    public void sampleOperation(){
        state.sampleOperation();
    }

    public void setState(State state) {
        this.state = state;
    }
}
