package com.wuyi.behavioralPattern.iterator;

/**
 * Created on 2017/6/16
 * 抽象迭代子
 * @author WuYi
 */
public interface IteratorDemo {
    public void first();
    public void next();
    public boolean isDone();
    public Object currentItem();
}
