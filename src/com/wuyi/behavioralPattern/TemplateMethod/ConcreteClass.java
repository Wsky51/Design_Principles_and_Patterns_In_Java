package com.wuyi.behavioralPattern.TemplateMethod;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class ConcreteClass extends AbstraceClass {
    @Override
    public void doOperation1() {
        System.out.println("操作1");
    }

    @Override
    public void doOperation2() {
        System.out.println("操作2");
    }

    public static void main(String[] args) {
        AbstraceClass a=new ConcreteClass();
        a.TemplateMethod();
    }
}
