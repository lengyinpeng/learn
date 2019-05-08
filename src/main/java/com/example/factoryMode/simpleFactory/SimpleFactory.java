package com.example.factoryMode.simpleFactory;

/**
 * @author zpp
 * 简单工厂
 * */
public class SimpleFactory {
    public static Fruit createFruit(String name){
        Fruit fruit = null;
        if("apple".equals(name)){
            fruit = new Apple();
        } else if("banana".equals(name)){
            fruit = new Banana();
        }
        return fruit;
    }
}
