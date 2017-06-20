package com.wuyi.behavioralPattern.immutable;

import java.io.Serializable;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class Complex extends Number implements Serializable,Cloneable,Comparable{
    static final public Complex i=new Complex(0.0,1.0);
    //实 部
    private double re;
    //虚部
    private double im;
    public Complex(Complex z){
        re=z.re;
        im=z.im;
    }
    //复数对象
    public Complex(double re,double im){
        this.re=re;
        this.im=im;
    }
    public Complex(double re){
        this.re=re;
        this.im=0.0;
    }
    public Complex(){
        re=0;
        im=0;
    }
    public boolean equals(Complex z){
        return (re==z.re&&im==z.im);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj==null){
            return false;
        }
        else if(obj instanceof Complex){
            return equals((Complex)obj);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        long re_bits=Double.doubleToLongBits(re);
        long im_bits = Double.doubleToLongBits(im);
        return (int)((re_bits^im_bits)^((re_bits^im_bits)>>32));
    }

    public double real(){
        return re;
    }
    public double imag(){
        return im;
    }
    public static double real(Complex z){
        return z.re;
    }
    public static double imag(Complex z){
        return z.im;
    }
    //相反数
    public static Complex negate(Complex z){
        return new Complex(-z.re,-z.im);
    }
    public static Complex conjugate(Complex z){
        return new Complex(z.re,-z.im);
    }
    public static Complex add(Complex x,Complex y){
        return new Complex(x.re+y.re,x.im+y.im);
    }
    public static Complex substract(Complex x,Complex y){
        return new Complex(x.re-y.re,x.im-y.im);
    }

    @Override
    public byte byteValue() {
        return super.byteValue();
    }

    @Override
    public short shortValue() {
        return super.shortValue();
    }

    @Override
    public int intValue() {
        return 0;
    }
    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
