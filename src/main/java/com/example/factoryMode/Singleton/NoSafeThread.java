package com.example.factoryMode.Singleton;

/**
 * @author zpp
 * 懒汉式-线程不安全
 * 多线程同时调用，会导致重复创建对象
 * */
public class NoSafeThread {
    private static NoSafeThread noSafeThread = null;

    private NoSafeThread(){}

    public static NoSafeThread getNoSafeThread(){
        if(noSafeThread == null){
            noSafeThread = new NoSafeThread();
        }
        return noSafeThread;
    }

    public void test(){
        System.out.println("懒汉式 - 线程不安全");
    }

}
