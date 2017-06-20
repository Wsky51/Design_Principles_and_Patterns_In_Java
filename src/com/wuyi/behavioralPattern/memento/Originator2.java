package com.wuyi.behavioralPattern.memento;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class Originator2 {
    private String state;
    public Originator2(){}
    //工厂对象，返回一个新的备忘录对象
    public MementoIF createMemento(){
        return new Memento2(this.state);
    }
    public void restoreMemento(MementoIF memento){
        Memento2 aMemento=(Memento2)memento;
        this.setState(aMemento.getState());
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("state="+state);
    }
    //内部成员类，备忘录
    protected class Memento2 implements MementoIF{
        private String savedState;
        private Memento2(String someState){
            savedState=someState;
        }
        private void setState(String someState){
            savedState=someState;
        }
        private String getState(){
            return savedState;
        }
    }
}
