package com.wuyi.behavioralPattern.command;

import java.awt.*;

/**
 * Created on 2017/6/18
 *
 * @author WuYi
 */
public class ResetCommand extends Button implements CommandFromGod {
    private Panel p;

    public ResetCommand(String caption, Panel pnl) {
        super(caption);
        p = pnl;
    }

    @Override
    public void execute() {
        p.setBackground(Color.black);
    }
}
