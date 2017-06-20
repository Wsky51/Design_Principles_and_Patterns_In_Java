package com.wuyi.structuralPattern.flyWeightPattern;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
abstract public class Order {
    //将咖啡卖个客人
    public abstract void serve(Table t);
    //返回咖啡的名字
    public abstract String getFlavor();
}
