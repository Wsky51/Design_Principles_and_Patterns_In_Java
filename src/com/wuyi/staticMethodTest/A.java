package com.wuyi.staticMethodTest;

/**
 * Created on 2017/6/10
 *
 * @author WuYi
 */
public class A { //父类
    private String name;
    public static String staticStr = "A静态属性";
    public String nonStaticStr = "A非静态属性";
    public static void staticMethod(){
        System.out.println("A静态方法staticMethod");
    }
    public void nonStaticMethod(){
        System.out.println("A非静态方法nonStaticMethod");
    }

//    public static void main(String[] args) {
//        System.out.println(staticStr);
//    }

}