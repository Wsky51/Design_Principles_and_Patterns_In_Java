package com.wuyi.behavioralPattern.chain;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public class JiaZheng extends Player{
    public JiaZheng(Player aSuccessor){
        this.setSuccessor(aSuccessor);
    }

    @Override
    public void handle(int i) {
        if (i==3){
            System.out.println("Jia Zheng gotta drink!");
        }
        else {
            System.out.println("Jia Zheng passed");
            next(i);
        }
    }
}
