package com.wuyi.behavioralPattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public class ClientPurchase {
    public static void main(String[] args) {
        Purchase p1=new PurchaseOfCopA();
        p1.append("PC");
        p1.append("Dish Washer");
        p1.append("Microwave");
        Purchase p2=new PurchaseOfCopB();
        p2.append("PC");
        p2.append("Dish Washer");
        p2.append("Microwave");
        IteratorInterface iterator1 = p1.createIterator();
        while (!iterator1.isDone()){
            System.out.println(iterator1.currentItem());
            iterator1.next();
        }
        System.out.println("==================");
        IteratorInterface iterator2 = p2.createIterator();
        while (!iterator2.isDone()){
            System.out.println(iterator2.currentItem());
            iterator2.next();
        }
    }
}
