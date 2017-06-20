package com.wuyi.behavioralPattern.visitor;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class HardDisk extends Equitment {
    @Override
    public double price() {
        return 200;
    }

    @Override
    public void accept(Visitor vis) {
        System.out.println("HardDisk has been visited");
        vis.visitHardDisk(this);
    }
}
