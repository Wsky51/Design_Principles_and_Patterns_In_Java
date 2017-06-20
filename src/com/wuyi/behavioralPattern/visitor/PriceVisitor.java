package com.wuyi.behavioralPattern.visitor;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public class PriceVisitor extends Visitor {
    private float total;
    public PriceVisitor(){
        total=0;
    }
    public float value(){
        return total;
    }

    @Override
    public void visitHardDisk(HardDisk e) {
        total+=e.price();
    }

    @Override
    public void VisitMainBoard(MainBoard e) {
        total+=e.price();
    }

    @Override
    public void visitCpu(Cpu e) {
        total+=e.price();
    }

    @Override
    public void visitPc(Pc e) {
        total+=e.price();
    }

    @Override
    public void visitCase(Case e) {
        total+=e.price();
    }

    @Override
    public void visitIntegratedBoard(IntegratedBoard e) {
        total+=e.price();
    }
}
