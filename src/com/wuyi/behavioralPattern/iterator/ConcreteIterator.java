package com.wuyi.behavioralPattern.iterator;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class ConcreteIterator implements IteratorDemo {
    private ConcreteAggregate agg;
    private int index=0;
    private int size=0;
    public ConcreteIterator(ConcreteAggregate agg){
        this.agg=agg;
        size=agg.size();
        index=0;
    }
    @Override
    public void first() {
        index=0;
    }

    @Override
    public void next() {
        if (index<size){
            index++;
        }
    }

    @Override
    public boolean isDone() {
        return (index>=size);
    }

    @Override
    public Object currentItem() {
        return agg.getElement(index);
    }
}
