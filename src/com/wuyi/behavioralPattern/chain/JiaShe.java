package com.wuyi.behavioralPattern.chain;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public class JiaShe extends Player {
    //构造子，以下家对象为参量
    public JiaShe(Player aSuccessor){
        this.setSuccessor(aSuccessor);
    }

    @Override
    public void handle(int i) {
        if (i==2){
            System.out.println("jia She gotta drink");
        }
        else {
            System.out.println("Jia She passed");
            next(i);
        }
    }
}
