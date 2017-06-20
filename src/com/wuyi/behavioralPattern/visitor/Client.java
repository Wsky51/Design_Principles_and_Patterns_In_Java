package com.wuyi.behavioralPattern.visitor;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class Client {
    public static void main(String[] args) {
        PriceVisitor pv=new PriceVisitor();
        InventoryVisitor iv=new InventoryVisitor();
        Equitment equip=new Pc();
        equip.accept(pv);
        System.out.println("Price:"+pv.value());
        System.out.println("\n");
        equip.accept(iv);
        System.out.println("Number of parts "+iv.size());
    }
}
