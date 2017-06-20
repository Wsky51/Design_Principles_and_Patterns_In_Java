package com.wuyi.behavioralPattern.visitor;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class Cpu extends Equitment {

    @Override
    public double price() {
        return 800;
    }

    @Override
    public void accept(Visitor vis) {
        System.out.println("CPU has been visited");
        vis.visitCpu(this);
    }
}
