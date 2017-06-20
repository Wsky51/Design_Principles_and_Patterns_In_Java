package com.wuyi.behavioralPattern.iterator;

import java.util.Vector;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public abstract class Purchase {
    private Vector elements=new Vector(5);
    //工厂方法，提供迭代子实例
    public abstract IteratorInterface createIterator();
    //将一个新元素增加到后面
    public void append(Object anObj){
        elements.add(anObj);
    }
    public void remove(Object anObj){
        elements.remove(anObj);
    }
    public Object currentItem(int n){
        return elements.elementAt(n);
    }
    public int count(){
        return elements.size();
    }
}
