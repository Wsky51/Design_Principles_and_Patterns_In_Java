package com.wuyi.structuralPattern.decorator;

import java.text.NumberFormat;

/**
 * Created on 2017/6/14
 *
 * @author WuYi
 */
public class OrderLine {
    private String itemName;
    private int units;
    private double unitPrice;
    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName){
        this.itemName=itemName;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public double getSubtotal(){
        return unitPrice*units;
    }
    private String formatCurrency(double amnt){
        return NumberFormat.getCurrencyInstance().format(amnt);
    }
    public void printLine(){
        System.out.println(itemName+"\t"+units+"\t"+formatCurrency(unitPrice)
                +"\t"+formatCurrency(getSubtotal()));
    }
//    public static void main(String[] args) {
//        OrderLine demo=new OrderLine();
//        demo.setItemName("伊利牛奶");
//        demo.setUnitPrice(3.2);
//        demo.setUnits(8);
//        demo.printLine();
//    }
}
