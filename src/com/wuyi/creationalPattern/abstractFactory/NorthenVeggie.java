package com.wuyi.creationalPattern.abstractFactory;

/**
 * Created on 2017/6/10
 *
 * @author WuYi
 */
public class NorthenVeggie implements Veggie{
    private String name;
    public NorthenVeggie(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
