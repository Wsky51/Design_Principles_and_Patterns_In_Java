package com.wuyi.behavioralPattern.TemplateMethod;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class CDAccount extends Account{
    @Override
    protected double doCalculateInterestRate() {
        return 0.065d;
    }
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }
}

