package com.wuyi.creationalPattern.builder;

/**
 * Created on 2017/6/12
 *
 * @author WuYi
 */
public class Directoe {
    private Builder builder;
    public void construct(){
        builder=new ConcreteBuilder();
        builder.builderPart1();
        builder.builderPart2();
        builder.retrieveResult();
    }
}
