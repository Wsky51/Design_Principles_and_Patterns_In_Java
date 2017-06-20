package com.wuyi.structuralPattern.flyWeightPattern;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class ClientCoffee {
    private static Order[] flavors=new Flavor[20];
    private static int ordersMade=0;
    private static FlavorFactory flavorFactory;
    public static void takeOrders(String aFlavor){
        flavors[ordersMade++]=flavorFactory.getOrder(aFlavor);
    }

    public static void main(String[] args) {
        //创建工厂
        flavorFactory=new FlavorFactory();
        //创建咖啡对象
        takeOrders("Black Coffee");
        takeOrders("Capucino");
        takeOrders("Espresso");
        takeOrders("Espresso");
        takeOrders("Capucino");
        takeOrders("Capucino");
        takeOrders("Black Coffee");
        takeOrders("Espresso");
        takeOrders("Capucino");
        takeOrders("Black Coffee");
        takeOrders("Espresso");
        for (int i=0;i<ordersMade;i++){
            flavors[i].serve(new Table(i));
        }
        System.out.println("\n总共有几种被制作？？"+flavorFactory.getTotalFlavorsMade());

    }

}
