package com.wuyi.creationalPattern.abstractFactory;

/**
 * Created on 2017/6/10
 *
 * @author WuYi
 */
public interface Gardener {
    public Fruit createFruit(String name);
    public Veggie createVeggie(String name);
}
