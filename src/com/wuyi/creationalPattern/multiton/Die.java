package com.wuyi.creationalPattern.multiton;

import java.util.Date;
import java.util.Map;
import java.util.Random;

/**
 * Created on 2017/6/11
 *
 * @author WuYi
 */
public class Die {
    private Die(){

    }
    private static Die die1=new Die();
    private static Die die2=new Die();
    public static Die getInstance(int whichOne){
        if (whichOne==1){
            return die1;
        }
        else {
            return die2;
        }
    }
    public synchronized int dice(){
        Date d=new Date();
        Random value=new Random(d.getTime());
        int i=Math.abs(value.nextInt());
        i=i%6;
        i=i+1;
        return i;
    }

}
