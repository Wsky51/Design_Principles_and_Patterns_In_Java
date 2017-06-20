package com.wuyi.behavioralPattern.chain;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public class JiaBaoYu extends Player{
    public JiaBaoYu(Player aSuccessor){
        this.setSuccessor(aSuccessor);
    }

    @Override
    public void handle(int i) {
        if (i==4){
            System.out.println("JiaBaoYu gotta drink!");
        }
        else {
            System.out.println("Jia Bao Yu gotta drink!");
            next(i);
        }
    }
}
