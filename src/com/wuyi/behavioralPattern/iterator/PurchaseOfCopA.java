package com.wuyi.behavioralPattern.iterator;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public class PurchaseOfCopA extends Purchase{
    public PurchaseOfCopA(){}

    @Override
    public IteratorInterface createIterator() {
        return new ForwardIterator(this);
    }
}
