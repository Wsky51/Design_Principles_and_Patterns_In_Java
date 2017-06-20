package com.wuyi.structuralPattern.flyWeightPattern;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class Flavor extends Order{
    private String flavor;
    public Flavor(String flavor){
        this.flavor=flavor;
    }
    @Override
    public void serve(Table t) {
        System.out.println("Serving flavor "+t.getNumber()+" 号桌子 with flavor"+flavor);
    }

    @Override
    public String getFlavor() {
        return this.flavor;
    }
}
