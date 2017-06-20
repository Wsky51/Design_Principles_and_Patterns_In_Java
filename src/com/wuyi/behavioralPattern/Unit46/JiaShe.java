package com.wuyi.behavioralPattern.Unit46;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class JiaShe extends Player{
    public JiaShe(Player aSuccessor){
        this.setSuccessor(aSuccessor);
    }

    @Override
    public void handle() {
        if (DrumBeater.stopped){
            System.out.println("JiaShe gotta drink!");
        }
        else {
            System.out.println("JiaShe passed");
            next();
        }
    }
}
