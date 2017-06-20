package com.wuyi.behavioralPattern.strategy;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class PercentageStrategy extends DiscountStrategy{
    private int precent;
    private int price;
    private int copies;
    public PercentageStrategy(int price,int copies){
        super(price,copies);
    }
    public int getPrecent(){
        return precent;
    }
    public void setPrecent(int precent){
        this.precent=precent;
    }

    @Override
    public int calculateDiscount() {
        return copies*price*precent;
    }
}
