package com.example.factoryMode.Singleton;

/**
 * @author zpp
 * 懒汉式-线程安全
 * 这种写法考虑了线程安全，将对singleton的null判断以及new的部分使用synchronized进行加锁。同时，对singleton对象使用volatile关键字进行限制，
 * 保证其对所有线程的可见性，并且禁止对其进行指令重排序优化。如此即可从语义上保证这种单例模式写法是线程安全的
 * */
public class SafeThread {
    private static volatile SafeThread safeThread = null;

    private SafeThread(){}

    public static SafeThread getSafeThread(){
        synchronized (SafeThread.class){
            if(safeThread == null){
                safeThread = new SafeThread();
            }
        }
        return safeThread;
    }

    public void test(){
        System.out.println("懒汉式 - 线程安全");
    }
}
