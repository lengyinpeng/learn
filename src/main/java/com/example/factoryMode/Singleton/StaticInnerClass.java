package com.example.factoryMode.Singleton;

/**
 * @author zpp
 * 静态内部类方式
 * 缺点：
 * 都需要额外的工作(Serializable、transient、readResolve())来实现序列化，否则每次反序列化一个序列化的对象实例时都会创建一个新的实例。
 * 可能会有人使用反射强行调用我们的私有构造器（如果要避免这种情况，可以修改构造器，让它在创建第二个实例的时候抛异常）。
 * */
public class StaticInnerClass {
    private static class Holder{
        private static StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
    private StaticInnerClass(){}

    public static StaticInnerClass getStaticInnerClass(){
        return Holder.staticInnerClass;
    }
}
