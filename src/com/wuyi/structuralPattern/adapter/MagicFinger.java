package com.wuyi.structuralPattern.adapter;

/**
 * Created on 2017/6/13
 *
 * @author WuYi
 */
public class MagicFinger implements BallIF {
    private double radius=0;
    private static final double PI=3.14D;
    private Cube adaptee;
    public MagicFinger(Cube adaptee){
        super();
        this.adaptee=adaptee;
        radius=adaptee.getWidth();
    }
    @Override
    public double claculateVolume() {
        return PI*4.0D/3.0D*(radius*radius*radius);
    }

    @Override
    public double calculateArea() {
        return PI*4.0D*(radius*radius);
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius=radius;
    }
}
