package com.wuyi.structuralPattern.facade;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class Camera {
    public void turnOn(){
        System.out.println("打开相机");
    }
    public void turnOff(){
        System.out.println("关闭相机");
    }
    public void rotate(int degrees){
        System.out.println("转动相机角度"+degrees);
    }

}
