package com.wuyi.structuralPattern.flyWeightPattern;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class ConcreteFlyWeight extends  FlyWeight{
    private Character intrinsicState=null;
    public ConcreteFlyWeight(Character state){
        this.intrinsicState=state;
    }
    @Override
    public void operation(String state) {
        System.out.println("\nIntrinsic State="+intrinsicState+",Extrinsic State="+state);
    }
}
