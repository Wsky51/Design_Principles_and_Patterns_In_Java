package com.wuyi.structuralPattern.facade;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class Sensor {
    public void activate(){
        System.out.println("激活控制器");
    }
    public void deactivate(){
        System.out.println("沉默控制器");
    }
    public void trigger(){
        System.out.println("触发感应器");
    }

}
