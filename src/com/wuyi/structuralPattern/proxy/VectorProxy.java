package com.wuyi.structuralPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

/**
 * Created on 2017/6/14
 *
 * @author WuYi
 */
public class VectorProxy implements InvocationHandler{
    private Object proxyObj;
    public VectorProxy(Object obj){
        proxyObj=obj;
    }
    public static Object factory(Object obj){
        Class <?> aClass = obj.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),new VectorProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling method");
        if (args!=null){
            for (int i=0;i<args.length;i++){
                System.out.println(args[i]+"");
            }
        }
        Object o = method.invoke(proxyObj, args);
        System.out.println("after calling "+method);
        return o;
    }

    public static void main(String[] args) {
        List v=null;
        v=(List)factory(new Vector<>(10));
        v.add("New");
        v.add("York");
    }
}
