package com.wuyi.creationalPattern.simpleFactoryPattern;

/**
 * Created on 2017/6/9
 *
 * @author WuYi
 */
public class Grape implements Fruit{
    private boolean seedless;

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }

    @Override
    public void grow() {
        log("Grape is growing");
    }

    @Override
    public void harvest() {
        log("Grape has been harvested");
    }

    @Override
    public void plant() {
        log("Grape has been planted");
    }
    /**
     * 辅助方法
     */
    public static void log(String msg){
        System.out.println(msg);
    }
}
