package com.wuyi.creationalPattern.factoryMethodPattern;

/**
 * Created on 2017/6/10
 *
 * @author WuYi
 */
public class ConcreteCreator1 implements Creator{
    @Override
    public Product factory() {
        return new ConcreteProduct1();
    }
}
