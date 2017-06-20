package com.wuyi.structuralPattern.decorator;

import java.util.Date;

/**
 * Created on 2017/6/14
 *
 * @author WuYi
 */
public class Client {
    private static Order order;
    public static void main(String[] args) {
        order=new SalesOrder();
        order.setSalesDate(new Date());
        order.setCustomName("Wuyi");
        OrderLine line1=new OrderLine();
        line1.setItemName("Wheel Tire");
        line1.setUnitPrice(154.23);
        line1.setUnits(4);
        order.addItem(line1);
        OrderLine line2=new OrderLine();
        line2.setItemName("Front Fender");
        line2.setUnitPrice(300.45);
        line2.setUnits(2);
        order.addItem(line2);
        order=new HeaderDecorator(new FooterDecorator(order));
        order.print();

    }
}
