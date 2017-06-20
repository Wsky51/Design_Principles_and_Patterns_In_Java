package com.wuyi.behavioralPattern.strategy;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class FlatRateStrategy  extends DiscountStrategy{
    private int price;
    private int copies;
    private int amount;
    public FlatRateStrategy(int price,int copies){
        super(price,copies);
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount=amount;
    }
    public int calculateDiscount(){
        return copies*amount;
    }
}
