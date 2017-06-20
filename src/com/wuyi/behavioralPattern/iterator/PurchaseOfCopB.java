package com.wuyi.behavioralPattern.iterator;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public class PurchaseOfCopB extends Purchase {
    public PurchaseOfCopB(){}

    @Override
    public IteratorInterface createIterator() {
        return new BackwardIterator(this);
    }
}
