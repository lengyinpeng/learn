package com.example.factoryMode.simpleFactory;

/**
 * @author zpp
 * 苹果类
 * */
public class Apple implements Fruit{
    private String name = "富士";
    public void buy(String value){
        System.out.println("买"+name+"   "+value);
    }
    public void show() {
        System.out.println("苹果五毛一个");
    }
}
