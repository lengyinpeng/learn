package com.example.factoryMode.simpleFactory;

import java.lang.reflect.Method;

/**
 * @author zpp
 * 测试工厂类
 * */
public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * 简单工厂测试
         */

        Fruit apple = (Apple)SimpleFactory.createFruit("apple");
        apple.show();
        ((Apple) apple).buy("565");
        Fruit banana = SimpleFactory.createFruit("banana");
        banana.show();
        /**
         * 反射简单工厂测试
         */
        Fruit apple1 = SimpleFactoryReflex.createFruit(Apple.class);
        apple1.show();
        Fruit b1 = SimpleFactoryReflex.createFruit(Banana.class);
        b1.show();

        Class<?> c1  = Class.forName(Apple.class.getName());
        Method met = c1.getMethod("buy",String.class);
        met.invoke(c1.newInstance(),"多少钱啊");

        Class<?> C2 = Class.forName(Banana.class.getName());
        Method method = C2.getMethod("bb",int.class,String.class);
        method.invoke(C2.newInstance(),2,"love");
    }
}
