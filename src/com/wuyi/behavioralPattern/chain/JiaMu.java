package com.wuyi.behavioralPattern.chain;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public class JiaMu extends Player {
    public JiaMu(Player aSuccessor){
        this.setSuccessor(aSuccessor);
    }

    @Override
    public void handle(int i) {
        if (i==1){
            System.out.println("JiaMu gotta drink!");
        }
        else {
            System.out.println("JiaMu pass");
            next(i);
        }
    }
}
