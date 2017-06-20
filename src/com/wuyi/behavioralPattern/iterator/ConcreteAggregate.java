package com.wuyi.behavioralPattern.iterator;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class ConcreteAggregate extends Aggregate {
    private Object[] objs={"Monk Tang","Monkey","Pigsy","Sandy","Horse"};

    @Override
    public IteratorDemo createIterator() {
        return new ConcreteIterator(this);
    }
    public int size(){
        return objs.length;
    }
    public Object getElement(int index){
        if (index<objs.length){
            return objs[index];
        }
        else
            return null;
    }
}
