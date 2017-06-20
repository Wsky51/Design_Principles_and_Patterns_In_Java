package com.wuyi.behavioralPattern.chain;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public abstract class Player {
    public abstract void handle(int i);
    private Player successor;
    public Player(){
        successor=null;
    }
    protected void setSuccessor(Player aSuccessor){
        successor=aSuccessor;
    }
    public void next(int index){
        if (successor!=null){
            successor.handle(index);
        }
        else {
            System.out.println("Program terminated");
            System.exit(0);
        }
    }
}
