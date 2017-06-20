package com.wuyi.structuralPattern.decorator;

/**
 * Created on 2017/6/13
 *
 * @author WuYi
 */
public class Decorator implements Component{
    private Component component;
    public Decorator(Component component){
        this.component=component;
    }
    public Decorator(){

    }
    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }
}
