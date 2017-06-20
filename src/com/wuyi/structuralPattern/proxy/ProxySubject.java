package com.wuyi.structuralPattern.proxy;

/**
 * Created on 2017/6/14
 *
 * @author WuYi
 */
public class ProxySubject {
    private RealSubject realSubject;
    public ProxySubject(){

    }
    //实现方法请求
    public void request(){
        preRequest();
        if (realSubject==null){
            realSubject=new RealSubject();
        }
        realSubject.request();
        postRequest();
    }
    //请求前操作
    private void preRequest(){

    }
    //请求后的操作
    private void postRequest(){

    }
}
