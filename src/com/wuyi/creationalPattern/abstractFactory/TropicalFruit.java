package com.wuyi.creationalPattern.abstractFactory;

/**
 * Created on 2017/6/10
 *
 * @author WuYi
 */
public class TropicalFruit implements Fruit {
    private String name;
    public TropicalFruit(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
