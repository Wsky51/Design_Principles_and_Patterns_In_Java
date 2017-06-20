package com.wuyi.creationalPattern.abstractFactory;

/**
 * Created on 2017/6/10
 *
 * @author WuYi
 */
public class TropicalGardener implements Gardener{
    @Override
    public Fruit createFruit(String name) {
        return new TropicalFruit(name);
    }

    @Override
    public Veggie createVeggie(String name) {
        return new TropicalVeggie(name);
    }
}
