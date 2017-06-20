package com.wuyi.structuralPattern.flyWeightPattern;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class Table {
    private int number;
    public Table(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
