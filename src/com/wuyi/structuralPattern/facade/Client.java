package com.wuyi.structuralPattern.facade;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class Client {
    private static SecurityFacade f=new SecurityFacade();
    public static void main(String[] args) {
        f.activate();

//        Camera c1=new Camera(),c2=new Camera();
//        Light l1=new Light(),l2=new Light(),l3=new Light();
//        Sensor s1=new Sensor();
//        Alarm alarm=new Alarm();
//        c1.turnOn();c2.turnOff();
//        l1.turnOn();l2.turnOn();l3.turnOn();
//        s1.activate();
//        alarm.activate();
    }
}
class SecurityFacade{
    public void activate(){
        Camera c1 = new Camera(), c2 = new Camera();
        Light l1 = new Light(), l2 = new Light(), l3 = new Light();
        Sensor s1 = new Sensor();
        Alarm alarm = new Alarm();
        c1.turnOn();
        c2.turnOff();
        l1.turnOn();
        l2.turnOn();
        l3.turnOn();
        s1.activate();
        alarm.activate();
    }
}
