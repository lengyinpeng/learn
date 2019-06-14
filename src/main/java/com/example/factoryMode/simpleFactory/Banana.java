package com.example.factoryMode.simpleFactory;

/**
 * @author zpp
 * 香蕉类
 * */
public class Banana implements Fruit{
    public void show() {
        System.out.println("香蕉两毛一个");
    }

    public void bb(int a,String b){System.out.println("总价钱 " + b + "    " + a * a);}
}
