package com.wuyi.creationalPattern.Prototype;

import java.awt.event.WindowAdapter;
import java.io.IOException;

/**
 * Created on 2017/6/13
 * 齐天大圣类
 * @author WuYi
 */
public class TheGratestStage {
    private Monkey monkey=new Monkey();
    public void change(){
        Monkey copyMonkey;
        for (int i=0;i<2000;i++){}
            try {
                copyMonkey=(Monkey)monkey.clone();
                System.out.println("复制前猴子monkey的出生日期是"+monkey.getBirthDate());
                System.out.println("复制后猴子copyMonkey的出生日期是"+copyMonkey.getBirthDate());
                System.out.println(monkey.getBirthDate()==copyMonkey.getBirthDate());
                System.out.println("monkey==copyMonkey??"+(monkey==copyMonkey));
                System.out.println("monkey.staff()==copyMonkey.staff()??"+(monkey.getStaff()==copyMonkey.getStaff()));
            }
//            catch (IOException e){
//            e.printStackTrace();
//            }
//            catch (ClassNotFoundException e){
//                e.printStackTrace();
//            }
            catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

    }

    public static void main(String[] args) {
        TheGratestStage sage=new TheGratestStage();
        sage.change();
    }
}
