package com.wuyi.behavioralPattern.Unit46;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class JiaZheng extends Player {
    public JiaZheng(Player aSuccessor) {
        this.setSuccessor(aSuccessor);
    }

    @Override
    public void handle() {
        if (DrumBeater.stopped) {
            System.out.println("JiaZheng gotta drink!");
        } else {
            System.out.println("JiaZheng passed!");
            next();
        }
    }
}
