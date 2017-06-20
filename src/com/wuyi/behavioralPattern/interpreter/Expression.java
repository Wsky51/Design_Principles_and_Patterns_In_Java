package com.wuyi.behavioralPattern.interpreter;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public abstract class Expression {
    //以环境类为准，本方法解释给定的任何一个表达式
    public abstract boolean interpret(Context ctx);
    //检验两个表达式在结构上是否相同
    public abstract boolean equals(Object o);
    //返回哈希值
    public abstract int hashCode();
    //转化字符串
    public abstract String toString();

}
