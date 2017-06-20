package com.wuyi.structuralPattern.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created on 2017/6/13
 *
 * @author WuYi
 */
public class Composite implements Component{
    private Vector componentVector=new Vector();

    @Override
    public Component getComponent() {
        return this;
    }

    @Override
    public void sampleOperation() {
        Enumeration enumeration = components();
        while (enumeration.hasMoreElements()){
            ((Component)enumeration.nextElement()).sampleOperation();
        }
    }
    public Enumeration components(){
        return componentVector.elements();
    }
    public void add(Component component){
        componentVector.add(component);
    }
    public void remove(Component component){
        componentVector.remove(component);
    }
}
