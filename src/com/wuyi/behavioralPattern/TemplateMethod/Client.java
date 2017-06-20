package com.wuyi.behavioralPattern.TemplateMethod;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class Client {
    private static Account acct=null;

    public static void main(String[] args) {
        acct=new MoneyMarketAccount();
        System.out.println("Interst from Money Market account "+acct.calculateInterest());
        acct=new CDAccount();
        System.out.println("Interst from CD account "+acct.calculateInterest());
    }
}
