package com.wuyi.behavioralPattern.visitor;

/**
 * Created on 2017/6/19
 *
 * @author WuYi
 */
public abstract class Visitor {
    public abstract void visitHardDisk(HardDisk e);
    public abstract void VisitMainBoard(MainBoard e);
    public abstract void visitCpu(Cpu e);
    public abstract void visitPc(Pc e);
    public abstract void visitCase(Case e);
    public abstract void visitIntegratedBoard(IntegratedBoard e);
}
