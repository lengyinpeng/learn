package com.example.factoryMode.Singleton;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args){
        //饿汉式
        Hungry hungry = Hungry.getHungry();
        hungry.doRun();
        //懒汉式 - 线程不安全
        NoSafeThread noSafeThread = NoSafeThread.getNoSafeThread();
        noSafeThread.test();
        //懒汉式 - 线程安全
        SafeThread safeThread = SafeThread.getSafeThread();
        safeThread.test();
        //懒汉式 - 线程安全且高效
        EfficiencyHighAndSafeThread efficiencyHighAndSafeThread = EfficiencyHighAndSafeThread.getEfficiencyHighAndSafeThread();
        efficiencyHighAndSafeThread.test();
        //枚举写法
        EnumTest.INSTANCESSSS.test();
    }
}
