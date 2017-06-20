package com.wuyi.behavioralPattern.memento;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class Caretaker {
    private Memento memento;
    //备忘录取值方法
    public Memento retrieveMemento(){
        return this.memento;
    }
    public void saveMemento(Memento memento){
        this.memento=memento;
    }

}
