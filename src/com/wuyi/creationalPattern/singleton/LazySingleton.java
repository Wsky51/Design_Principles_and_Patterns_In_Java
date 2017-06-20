package com.wuyi.creationalPattern.singleton;

/**
 * Created on 2017/6/11
 *
 * @author WuYi
 */
public class LazySingleton {
    private static LazySingleton m_instance=null;
    private LazySingleton(){

    }
    public synchronized static LazySingleton getInstance(){
        if (m_instance==null){
            m_instance=new LazySingleton();
        }
        return m_instance;
    }
}
