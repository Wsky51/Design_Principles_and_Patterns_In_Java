package com.wuyi.behavioralPattern.visitor;

import java.util.Vector;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class InventoryVisitor extends Visitor {
    private Vector inv;
    public InventoryVisitor(){
        inv=new Vector(10,5);
    }
    public int size(){
        return inv.size();
    }

    @Override
    public void visitHardDisk(HardDisk e) {
        inv.addElement(e);
    }

    @Override
    public void VisitMainBoard(MainBoard e) {
        inv.addElement(e);
    }

    @Override
    public void visitCpu(Cpu e) {
        inv.addElement(e);
    }

    @Override
    public void visitPc(Pc e) {
        inv.addElement(e);
    }

    @Override
    public void visitCase(Case e) {
        inv.addElement(e);
    }

    @Override
    public void visitIntegratedBoard(IntegratedBoard e) {
        inv.addElement(e);
    }
}
