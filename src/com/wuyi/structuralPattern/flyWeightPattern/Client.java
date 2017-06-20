package com.wuyi.structuralPattern.flyWeightPattern;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class Client {
    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
//        FlyWeight fly = factory.factory(new Character('a'));
//        fly.operation("First call");
//        fly=factory.factory(new Character('b'));
//        fly.operation("Second call");
//        factory.factory(new Character('a'));
//        fly.operation("Third call");
//        factory.checkFlyweight();
        FlyWeight fly=factory.factory("aba");
        fly.operation("composite call");
        factory.checkFlyweight();

    }
}
