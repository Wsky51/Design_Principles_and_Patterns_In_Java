package com.wuyi.behavioralPattern.observer;

import java.util.*;

/**
 * Created on 2017/6/16
 *
 * @author WuYi
 */
public class WatcherClient {
    public static void main(String[] args) {
        Watched watched=new Watched();
        java.util.Observer watcher=new Watcher(watched);
        watched.changeDate("IN C,WE CREATE BUGS");
        watched.changeDate("IN JAVA,WE INHERIT BUGS");
        watched.changeDate("IN JAVA,WE INHERIT BUGS");
        watched.changeDate("In vis");
    }
}
