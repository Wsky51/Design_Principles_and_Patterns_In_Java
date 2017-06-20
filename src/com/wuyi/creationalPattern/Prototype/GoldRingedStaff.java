package com.wuyi.creationalPattern.Prototype;

import java.io.Serializable;

/**
 * Created on 2017/6/13
 *
 * 金箍棒类
 * @author WuYi
 */
public class GoldRingedStaff implements Cloneable,Serializable {
    private float height=100.0F;
    private float diameter=10.0F;
    public GoldRingedStaff(){
        System.out.println("金箍棒的构造方法");
    }

    /**
     * 增长行为
     */
    public void grow(){
        this.diameter*=2;
        this.height*=2;
    }
    /**
     * 缩小行为
     *
     */
    public void shrink(){
        this.diameter/=2;
        this.height/=2;
    }
    /**
     * 移动方法
     */
    public void move(){
        System.out.println("金箍棒的移动方法");
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
}
