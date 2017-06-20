package com.wuyi.behavioralPattern.interpreter;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class Variable extends Expression{
    private String name;
    public Variable(String name){
        this.name=name;
    }
    //解释操作
    @Override
    public boolean interpret(Context ctx) {
        return ctx.lookup(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o!=null&&o instanceof Variable){
            return this.name.equals(((Variable)o).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
