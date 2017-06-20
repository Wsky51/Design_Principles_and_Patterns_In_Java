package com.wuyi.staticMethodTest;

/**
 * Created on 2017/6/10
 *
 * @author WuYi
 */
public class C extends A{//子类C继承A中的所有属性和方法

    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.addA();
        System.out.println(d1.addA());
        Demo d2=new Demo();
        d2.addA();
        System.out.println(d2.addA());
    }
}
class Demo{
    private static int a=3;
    public  int addA(){
        a++;
        return a;
    }
}


