package com.wuyi.structuralPattern.flyWeightPattern;

/**
 * Created on 2017/6/15
 *
 * @author WuYi
 */
public class ClientUpdate {
    private static Order[] flavors=new Flavor[100];
    private static int ordersMade=0;
    private static FlavorFactory flavorFactory;
    private static void takeOrders(String aFlavor){
        flavors[ordersMade++]=flavorFactory.getOrder(aFlavor);
    }
    public static void main(String[] args) {
        flavorFactory=new FlavorFactory();
//        创建咖啡对象
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
        System.out.println("\n总共有几种味道的咖啡可以出售"+flavorFactory.getTotalFlavorsMade());
    }
}
