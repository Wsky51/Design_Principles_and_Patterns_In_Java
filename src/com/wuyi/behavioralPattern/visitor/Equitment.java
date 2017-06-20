package com.wuyi.behavioralPattern.visitor;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public abstract class Equitment {
    public abstract void accept(Visitor vis);

    public abstract double price();

}
