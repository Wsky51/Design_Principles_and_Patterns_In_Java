package com.wuyi.behavioralPattern.visitor;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class Pc extends Composite{
    public Pc(){
        super.add(new IntegratedBoard());
        super.add(new HardDisk());
        super.add(new Case());
    }

    @Override
    public void accept(Visitor vis) {
        System.out.println("Pc has been visited");
        super.accept(vis);
    }
}
