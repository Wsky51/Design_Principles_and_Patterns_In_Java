package com.wuyi.behavioralPattern.chain;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public class JiaHuan extends Player {
    public JiaHuan(Player aSuccessor){
        this.setSuccessor(aSuccessor);
    }

    @Override
    public void handle(int i) {
        if (i==5){
            System.out.println("Jia Huan gotta drink");
        }
        else {
            System.out.println("Jia Huan passed");
            next(i);
        }
    }
}
