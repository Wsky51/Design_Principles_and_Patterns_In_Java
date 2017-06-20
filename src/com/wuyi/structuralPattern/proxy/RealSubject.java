package com.wuyi.structuralPattern.proxy;

/**
 * Created on 2017/6/14
 *
 * @author WuYi
 */
public class RealSubject extends Subject {
    public RealSubject(){

    }
    @Override
    public void request() {
        System.out.println("Form real subject");
    }
}
