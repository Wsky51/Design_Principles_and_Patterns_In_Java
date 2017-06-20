package com.wuyi.creationalPattern.singleton;

/**
 * Created on 2017/6/11
 * 饿汉模式
 * @author WuYi
 */
public class EagerSingleton {
    private static final EagerSingleton m_instance=new EagerSingleton();
    private EagerSingleton(){

    }
    public static EagerSingleton getInstance(){
        return m_instance;
    }
}
