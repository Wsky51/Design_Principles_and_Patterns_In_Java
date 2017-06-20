package com.wuyi.staticMethodTest;

/**
 * Created on 2017/6/10
 *
 * @author WuYi
 */

public class B extends A{//子类B
    public static String staticStr = "B改写后的静态属性";
    public String nonStaticStr = "B改写后的非静态属性";
    @Override
    public void nonStaticMethod() {
        System.out.println("B中改写后的非静态nonStaticMethod");
    }
//    public static void staticMethod(){
//        System.out.println("B改写后的静态方法staticMethod");
//    }

}