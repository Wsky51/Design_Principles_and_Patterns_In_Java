package com.wuyi.structuralPattern.flyWeightPattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class FlyWeightFactorySingleton {
    private HashMap files=new HashMap();
    private static FlyWeightFactorySingleton myself=new FlyWeightFactorySingleton();
    private FlyWeightFactorySingleton(){}
    public static FlyWeightFactorySingleton getInstance(){
        return myself;
    }
    //工厂方法
    public synchronized FlyWeight Factory(Character state){
        if (files.containsKey(state)){
            return (FlyWeight) files.get(state);
        }
        else {
            FlyWeight fly=new ConcreteFlyWeight(state);
            files.put(state,fly);
            return fly;
        }
    }
    public void checkFlyweight(){
        FlyWeight fly;
        int i=0;
        System.out.println("\n=========checkFlyWeight()===========");
        for (Iterator it = files.entrySet().iterator(); it.hasNext();){
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("Item"+(++i)+":"+e.getKey());
        }
        System.out.println("=======checkFlyweight()=========");
    }
}
