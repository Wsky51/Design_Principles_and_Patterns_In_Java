package com.wuyi.structuralPattern.flyWeightPattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class FlyWeightFactory {
    private HashMap files=new HashMap();
    private FlyWeight lnkFlyweight;
    public FlyWeightFactory(){

    }
    public FlyWeight factory(Character state){
        if (files.containsKey(state)){
            return (FlyWeight) files.get(state);
        }
        else {
            FlyWeight fly=new ConcreteFlyWeight(state);
            files.put(state,fly);
            return fly;
        }
    }
    public FlyWeight factory(String compositState){
        ConcreteCompositeFlyWeight compositeFly=new ConcreteCompositeFlyWeight();
        int length = compositState.length();
        Character state=null;
        for (int i=0;i<length;i++){
            state=new Character(compositState.charAt(i));
            System.out.println("factory("+state+")");
            compositeFly.add(state,this.factory(state));
        }
        System.out.println(compositeFly.getClass().getName());
        return compositeFly;
    }


    public void checkFlyweight(){
        FlyWeight fly;
        int i=0;
        System.out.println("\n=========checkFlyWeight()===========");
        for (Iterator it=files.entrySet().iterator();it.hasNext();){
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("Item"+(++i)+":"+e.getKey());
        }
        System.out.println("=======checkFlyweight()=========");
    }

}
