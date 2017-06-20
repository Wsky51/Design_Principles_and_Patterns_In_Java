package com.wuyi.creationalPattern.simpleFactoryPattern;

/**
 * Created on 2017/6/9
 *
 * @author WuYi
 */
public class Apple implements Fruit {
    private int treeAge;

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    @Override
    public void grow() {
        log("Apple is growing");
    }

    @Override
    public void harvest() {
        log("Apple has been harvest");
    }

    @Override
    public void plant() {
        log("Apple has been planted");
    }
    /**
     * 辅助方法
     */
    public static void log(String msg){
        System.out.println(msg);
    }
}
