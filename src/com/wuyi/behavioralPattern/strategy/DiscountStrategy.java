package com.wuyi.behavioralPattern.strategy;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public abstract class DiscountStrategy {
    private int price=0;
    private int copies=0;
    public abstract int calculateDiscount();
    public DiscountStrategy(int price,int copies){
        this.price=price;
        this.copies=copies;
    }
}
