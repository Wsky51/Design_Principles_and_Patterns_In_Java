package com.wuyi.structuralPattern.flyWeightPattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class ConcreteCompositeFlyWeight extends FlyWeight {
    private HashMap files=new HashMap(10);
    private FlyWeight flyweight;
    public ConcreteCompositeFlyWeight(){}
    public void add(Character key,FlyWeight fly){
        files.put(key,fly);
    }

    @Override
    public void operation(String state) {
        FlyWeight fly=null;
        for (Iterator it=files.entrySet().iterator();it.hasNext();){
            Map.Entry e = (Map.Entry) it.next();
            fly =(FlyWeight)e.getValue();
            fly.operation(state);
        }
    }
}
