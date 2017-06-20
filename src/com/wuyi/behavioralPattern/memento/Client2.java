package com.wuyi.behavioralPattern.memento;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class Client2 {
    public static void main(String[] args) {
        Originator2 o=new Originator2();
        Caretaker2 c=new Caretaker2();
        o.setState("ON");
        c.saveMemento(o.createMemento());
        o.setState("Off");
        o.restoreMemento(c.retrieveMemento());
    }
}
