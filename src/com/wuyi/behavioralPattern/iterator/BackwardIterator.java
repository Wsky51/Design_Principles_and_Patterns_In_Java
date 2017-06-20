package com.wuyi.behavioralPattern.iterator;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public class BackwardIterator implements IteratorInterface {
    private Purchase obj;
    private int state;
    public BackwardIterator(Purchase obj){
        this.obj=obj;
        state=obj.count()-1;
    }
    @Override
    public void first() {
        state=obj.count()-1;
    }

    @Override
    public void next() {
        if (!isDone()){
            state--;
        }
    }

    @Override
    public boolean isDone() {
        return state<0?true:false;
    }

    @Override
    public Object currentItem() {
        return obj.currentItem(state);
    }
}
