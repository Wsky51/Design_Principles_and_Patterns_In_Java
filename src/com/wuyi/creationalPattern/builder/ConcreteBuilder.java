package com.wuyi.creationalPattern.builder;

/**
 * Created on 2017/6/12
 *
 * @author WuYi
 */
public class ConcreteBuilder extends Builder {
    private Product product=new Product();
    @Override
    public void builderPart1() {

    }

    @Override
    public void builderPart2() {

    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
