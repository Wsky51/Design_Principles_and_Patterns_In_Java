package com.wuyi.creationalPattern.multiton;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;

/**
 * Created on 2017/6/11
 *
 * @author WuYi
 */
public class Client {
    private static Die die1,die2;

    public static void main(String[] args) {
        die1=Die.getInstance(1);
        die2=Die.getInstance(2);
        int dice = die1.dice();
        int dice1 = die2.dice();
        System.out.println(dice);
        System.out.println(dice1);
        Locale us = Locale.US;
        System.out.println(us);
    }
}




