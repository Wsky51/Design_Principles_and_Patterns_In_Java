package com.wuyi.behavioralPattern.visitor;

import java.util.Vector;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class Composite extends Equitment {
    private Vector parts=new Vector(10);
    public Composite(){}

    @Override
    public double price() {
        double total=0;
        for (int i=0;i<parts.size();i++){
            total+=((Equitment)parts.get(i)).price();
        }
        return total;
    }

    @Override
    public void accept(Visitor vis) {
        for (int i=0;i<parts.size();i++){
            ((Equitment)parts.get(i)).accept(vis);
        }
    }
    public void add(Equitment e){
        parts.add(e);
    }
}
