package com.wuyi.structuralPattern.facade;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class Light {
    public void turnOn(){
        System.out.println("打开灯泡");
    }
    public void turnOff(){
        System.out.println("关闭灯泡");
    }
    public void changeBulb(){
        System.out.println("换一个灯泡");
    }
}
