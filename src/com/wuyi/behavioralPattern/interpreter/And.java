package com.wuyi.behavioralPattern.interpreter;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class And extends Expression {
    private Expression left, right;

    public And(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //解释操作
    @Override
    public boolean interpret(Context ctx) {
        return left.interpret(ctx)&&right.interpret(ctx);
    }

    @Override
    public boolean equals(Object o) {
        if (o!=null&&o instanceof And){
            return this.left.equals(((And)o).left)&&this.right.equals(((And)o).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.toString()).hashCode();
    }

    @Override
    public String toString() {
        return "("+left.toString()+"AND"+right.toString()+")";
    }
}
