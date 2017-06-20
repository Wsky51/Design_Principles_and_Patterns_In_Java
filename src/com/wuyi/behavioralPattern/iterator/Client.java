package com.wuyi.behavioralPattern.iterator;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class Client {
    private IteratorDemo it;
    private Aggregate agg = new ConcreteAggregate();

    public void operation() {
        it = agg.createIterator();
        while (!it.isDone()) {
            System.out.println(it.currentItem().toString());
            it.next();
        }
    }

    public static void main(String[] args) {
        Client client=new Client();
        client.operation();
    }
}
