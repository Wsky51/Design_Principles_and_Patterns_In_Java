package com.wuyi.structuralPattern.facade;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class Alarm {
    public void activate(){
        System.out.println("启动报警器");
    }
    public void deactivate(){
        System.out.println("关闭报警器");
    }
    public void ring(){
        System.out.println("拉响警报");
    }
    public void stopRing(){
        System.out.println("停止警报");
    }
}
