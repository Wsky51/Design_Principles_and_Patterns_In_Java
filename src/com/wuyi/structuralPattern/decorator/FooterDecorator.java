package com.wuyi.structuralPattern.decorator;

import com.sun.imageio.plugins.common.InputStreamAdapter;

import java.io.*;

/**
 * Created on 2017/6/14
 *
 * @author WuYi
 */
public class FooterDecorator extends OrderDecorator {
    public FooterDecorator(Order anOrder){
        super(anOrder);
    }

    @Override
    public void print() {
        super.order.print();
        printFooter();
    }
    private void printFooter(){
        System.out.println("===========================");
        System.out.println("Total\t\t\t\t"+formatCurrency(super.order.getGrandTotal()));
    }

    public static void main(String[] args) {
        String line;
        InputStreamReader input=new InputStreamReader(System.in);
        System.out.println("please input data");
        BufferedReader reader=new BufferedReader(input);
        try {
            line=reader.readLine();
            System.out.println("Data entered"+line);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
