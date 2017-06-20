package com.wuyi.structuralPattern.flyWeightPattern;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
abstract public class FlyWeight {
    //外蕴状态作为参量传入到方法中
    abstract public void operation(String state);
}
