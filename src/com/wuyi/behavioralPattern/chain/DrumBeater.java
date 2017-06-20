package com.wuyi.behavioralPattern.chain;

/**
 * Created on 2017/6/17
 *
 * @author WuYi
 */
public class DrumBeater {
    private static Player player;

    public static void main(String[] args) {
        //创建责任链模式
        player=new JiaMu(new JiaZheng(new JiaBaoYu(new JiaHuan(null))));
        player.handle(4);
    }
}
