package com.wuyi.creationalPattern.simpleFactoryPattern;

import com.wuyi.exception.BadFruitException;

/**
 * Created on 2017/6/9
 *
 * @author WuYi
 */
public class FruitGardener {
    /**
     * 静态工厂方法
     *
     */
    public static Fruit factory(String which) throws BadFruitException {
        if (which.equalsIgnoreCase("apple")){
            return new Apple();
        }
        else if (which.equalsIgnoreCase("strawberry")){
            return new Strawberry();
        }
        else if (which.equalsIgnoreCase("grape")){
            return new Grape();
        }
        else {
            throw new BadFruitException("Bad fruit request");
        }
    }
}
