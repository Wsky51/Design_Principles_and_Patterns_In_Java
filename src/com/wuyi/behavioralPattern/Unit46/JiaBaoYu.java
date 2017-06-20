package com.wuyi.behavioralPattern.Unit46;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class JiaBaoYu extends Player {
    public JiaBaoYu(Player aSuccessor){
        this.setSuccessor(aSuccessor);
    }

    @Override
    public void handle() {
        if (DrumBeater.stopped){
            System.out.println("JiaBaoYu gotta drink!");
        }
        else {
            System.out.println("JiaBaoYu passed");
            next();
        }
    }
}
