package com.wuyi.structuralPattern.decorator;

/**
 * Created on 2017/6/14
 *
 * @author WuYi
 */
public class OrderDecorator extends Order {
    protected Order order;
    public OrderDecorator(Order order){
        this.order=order;
        this.setSalesDate(order.getSalesDate());
        this.setCustomName(order.getCustomName());
    }

    @Override
    public void print() {
        super.print();
    }


}
