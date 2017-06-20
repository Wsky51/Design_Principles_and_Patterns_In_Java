package com.wuyi.creationalPattern.simpleFactoryPattern;

import com.wuyi.exception.BadFruitException;

/**
 * Created on 2017/6/10
 *
 * @author WuYi
 */
public class FactoryTest {
    public static void main(String[] args) {
        try {
            Fruit apple = FruitGardener.factory("apple");
            Fruit grape=FruitGardener.factory("grape");
            Fruit strawBerry=FruitGardener.factory("strawberry");
            apple.grow();
            grape.grow();
            strawBerry.grow();
        } catch (BadFruitException e) {
            e.printStackTrace();
        }
    }
}
