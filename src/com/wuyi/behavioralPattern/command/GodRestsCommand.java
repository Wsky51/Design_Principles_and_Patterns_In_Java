package com.wuyi.behavioralPattern.command;

import java.awt.*;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class GodRestsCommand extends Button implements CommandFromGod{
    public GodRestsCommand(String caption){
        super(caption);
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
