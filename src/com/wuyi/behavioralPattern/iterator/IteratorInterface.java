package com.wuyi.behavioralPattern.iterator;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public interface IteratorInterface {
    public void first();
    public void next();
    public boolean isDone();
    public Object currentItem();
}
