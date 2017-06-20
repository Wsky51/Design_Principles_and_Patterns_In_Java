package com.wuyi.behavioralPattern.Unit46;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class JiaMu extends Player {
    public JiaMu(Player aSuccessor){
        this.setSuccessor(aSuccessor);
    }

    @Override
    public void handle() {
        //检查击鼓是否已经停止
        if (DrumBeater.stopped){
            System.out.println("JiaMu gotta drink!");
        }
        else {
            System.out.println("JiaMu Passed!");
            next();
        }
    }
}
