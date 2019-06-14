package com.example.factoryMode.Singleton;

/**
 * @author zpp
 * 懒汉式-线程安全并高效的方式
 * 双重检查锁
 * 禁止指令重排优化这条语义直到jdk1.5以后才能正确工作。此前的JDK中即使将变量声明为volatile也无法完全避免重排序所导致的问题。
 * 所以，在jdk1.5版本前，双重检查锁形式的单例模式是无法保证线程安全的。
 * */
public class EfficiencyHighAndSafeThread {
    private static EfficiencyHighAndSafeThread efficiencyHighAndSafeThread = null;

    private EfficiencyHighAndSafeThread(){}

    public static EfficiencyHighAndSafeThread getEfficiencyHighAndSafeThread(){
        if(efficiencyHighAndSafeThread == null){
            synchronized(EfficiencyHighAndSafeThread.class){
                if(efficiencyHighAndSafeThread == null){
                    efficiencyHighAndSafeThread = new EfficiencyHighAndSafeThread();
                }
            }
        }
        return efficiencyHighAndSafeThread;
    }

    public void test(){
        System.out.println("懒汉式 - 线程安全且高效");
    }

}
