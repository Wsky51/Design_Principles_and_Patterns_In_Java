package com.wuyi.behavioralPattern.command;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class TheWorld extends Frame implements ActionListener{
    private LetThereBeLightCommand btnLight;
    private LetThereBeLandCommand btnLand;
    private ResetCommand btnReset;
    private GodRestsCommand btnExit;
    private Panel p;
    public TheWorld(){
        super("This is the world ,and God says...");
        p=new Panel();
        p.setBackground(Color.black);
        add(p);
        btnLight=new LetThereBeLightCommand("Let there be light",p);
        btnLand=new LetThereBeLandCommand("Let there be land",p);
        btnReset=new ResetCommand("Reset",p);
        btnExit=new GodRestsCommand("God rests");
        p.add(btnLight);
        p.add(btnLand);
        p.add(btnReset);
        p.add(btnExit);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        btnLight.addActionListener(this);
        btnLand.addActionListener(this);
        btnReset.addActionListener(this);
        btnExit.addActionListener(this);
        setBounds(100,100,400,200);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        CommandFromGod obj=(CommandFromGod) e.getSource();
        obj.execute();
    }

    public static void main(String[] args) {
        new TheWorld();
    }
}
