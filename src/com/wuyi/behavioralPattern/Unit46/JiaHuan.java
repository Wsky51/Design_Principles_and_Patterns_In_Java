package com.wuyi.behavioralPattern.Unit46;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class JiaHuan extends Player {
    public JiaHuan(Player aSuccessor){
        this.setSuccessor(aSuccessor);
    }

    @Override
    public void handle() {
        if (DrumBeater.stopped){
            System.out.println("JiaHuan gotta drink!");
        }
        else {
            System.out.println("JiaHuan passed!");
            next();
        }
    }
}
