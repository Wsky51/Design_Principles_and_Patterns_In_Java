package com.wuyi.behavioralPattern.Unit46;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
abstract class Player {
    public abstract void handle();
    private Player successor;
    public Player(){
        successor=null;
    }
    protected void setSuccessor(Player aSuccessor){
        this.successor=aSuccessor;
    }
    public void next(){
        if (successor!=null)
            successor.handle();
        else
            System.out.println("Program is terminating");
            System.exit(0);
    }
}
