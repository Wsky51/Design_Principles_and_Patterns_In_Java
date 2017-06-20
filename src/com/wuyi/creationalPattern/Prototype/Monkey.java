package com.wuyi.creationalPattern.Prototype;

import java.io.*;
import java.util.Date;

/**
 * Created on 2017/6/13
 *
 * @author WuYi
 */
public class Monkey implements Cloneable,Serializable {
    private int height;
    private int weight;
    private GoldRingedStaff staff;
    private Date birthDate;

    public Monkey() {
        this.birthDate = new Date();
        this.staff=new GoldRingedStaff();
    }

    /**
     * 深克隆方法
     * @return
     */
    public Object deepClone() throws IOException,OptionalDataException,ClassNotFoundException{
        //将对象写入到流里
        ByteArrayOutputStream bo=new ByteArrayOutputStream();
        ObjectOutputStream oo=new ObjectOutputStream(bo);
        oo.writeObject(this);
        oo.flush();
        //将对象从流中读取出来
        ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi=new ObjectInputStream(bi);
        System.out.println("深复制完成");
        return (Monkey)(oi.readObject());

    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Monkey temp = null;
        try {
            temp = (Monkey) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } finally {
            return temp;
        }

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public GoldRingedStaff getStaff() {
        return staff;
    }

    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}

