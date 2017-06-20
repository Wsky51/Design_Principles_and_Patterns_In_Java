package com.wuyi.structuralPattern.decorator;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Vector;

/**
 * Created on 2017/6/14
 *
 * @author WuYi
 */
abstract public class Order {
    private OrderLine inkOrderLine;
    protected String customName;
    protected Date salesDate;
    protected Vector items=new Vector(10);
    public void print(){
        for (int i=0;i<items.size();i++){
            OrderLine item = (OrderLine) items.get(i);
            item.printLine();
        }
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }
    public void addItem(OrderLine item){
        items.add(item);
    }
    public void removeItem(OrderLine item){
        items.remove(item);
    }
    public double getGrandTotal(){
        double amnt=0.0d;
        for (int i=0;i<items.size();i++){
            OrderLine item = (OrderLine) items.get(i);
            amnt+=item.getSubtotal();
        }
        return amnt;
    }
    protected String formatCurrency(double amnt){
        return NumberFormat.getCurrencyInstance().format(amnt);
    }

}

