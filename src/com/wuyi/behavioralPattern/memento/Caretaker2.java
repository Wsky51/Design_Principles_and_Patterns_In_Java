package com.wuyi.behavioralPattern.memento;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class Caretaker2 {
    private MementoIF memento;

    //备忘录取值方法
    public MementoIF retrieveMemento() {
        return this.memento;
    }

    //备忘录赋值方法
    public void saveMemento(MementoIF memento) {
        this.memento = memento;
    }

}
