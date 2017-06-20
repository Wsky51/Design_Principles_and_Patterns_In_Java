package com.wuyi.behavioralPattern.TemplateMethod;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public abstract class AbstraceClass {
    public void TemplateMethod(){
        doOperation1();
        doOperation2();
        doOperation3();
    }
    public abstract void doOperation1();
    public abstract void doOperation2();
    public final void doOperation3(){
        System.out.println("操作3");
    }


}
