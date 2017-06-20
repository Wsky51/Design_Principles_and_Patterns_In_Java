package com.wuyi.behavioralPattern.visitor;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class IntegratedBoard extends Composite {
    public IntegratedBoard(){
        super.add(new MainBoard());
        super.add(new Cpu());
    }

    @Override
    public void accept(Visitor vis) {
        System.out.println("IntegratedBoard has been visited");
        super.accept(vis);
    }
}
