package com.wuyi.behavioralPattern.TemplateMethod;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public abstract class Account {
    protected String accountNumber;
    public Account(){
        accountNumber=null;
    }
    public Account(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public final double calculateInterest(){
        double interestRate=doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType, accountNumber);
        return amount*interestRate;
    }
    protected abstract String doCalculateAccountType();
    protected abstract double doCalculateInterestRate();
    public final double calculateAmount(String accountType,String accountNumber){
        //省略
        return 7243.00d;
    }


}
