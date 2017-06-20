package com.wuyi.structuralPattern.adapter;

/**
 * Created on 2017/6/13
 *
 * @author WuYi
 */
public class Cube {
    private double width;
    public Cube(double width){
        this.width=width;
    }
    public double calculateVolume(){
        return width*width*width;
    }
    public double calculFaceArea(){
        return width*width;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
