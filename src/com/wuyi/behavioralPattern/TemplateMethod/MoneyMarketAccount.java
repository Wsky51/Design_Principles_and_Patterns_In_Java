package com.wuyi.behavioralPattern.TemplateMethod;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class MoneyMarketAccount extends Account{
    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045d;
    }
}
