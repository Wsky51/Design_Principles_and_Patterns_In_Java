package com.wuyi.behavioralPattern.visitor;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class MainBoard extends Equitment{
    @Override
    public double price() {
        return 100.00;
    }

    @Override
    public void accept(Visitor v) {
        System.out.println("MainBoard has been visited");
        v.VisitMainBoard(this);
    }
}
