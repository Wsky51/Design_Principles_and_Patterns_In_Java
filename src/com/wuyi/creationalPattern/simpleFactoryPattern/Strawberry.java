package com.wuyi.creationalPattern.simpleFactoryPattern;

/**
 * Created on 2017/6/9
 *
 * @author WuYi
 */
public class Strawberry implements Fruit{
    @Override
    public void grow() {
        log("Strawberry is growing");
    }

    @Override
    public void harvest() {
        log("Strawberry has been harvested");
    }

    @Override
    public void plant() {
        log("Strawberry has been planted");
    }
    /**
     * 辅助方法
     */
    public static void log(String msg){
        System.out.println(msg);
    }
}
