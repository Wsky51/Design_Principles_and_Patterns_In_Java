package com.wuyi.behavioralPattern.visitor;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class Case extends Equitment {
    @Override
    public double price() {
        return 30;
    }

    @Override
    public void accept(Visitor vis) {
        System.out.println("Case has been visited");
        vis.visitCase(this);
    }
}
