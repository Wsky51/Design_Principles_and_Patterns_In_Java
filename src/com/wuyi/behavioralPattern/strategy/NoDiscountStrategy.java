package com.wuyi.behavioralPattern.strategy;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class NoDiscountStrategy extends DiscountStrategy{
    private int price=0;
    private int copies=0;
    public NoDiscountStrategy(int price,int copies){
        super(price,copies);
    }
    @Override
    public int calculateDiscount() {
        return 0;
    }
}
