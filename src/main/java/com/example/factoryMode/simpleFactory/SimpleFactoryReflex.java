package com.example.factoryMode.simpleFactory;
/**java8 定义对象
 * @author zpp
 * 简单工厂反射实现
 * */
public class SimpleFactoryReflex {
    public static Fruit createFruit(Class c) throws Exception {
        Fruit fruit = null;
        fruit = (Fruit) Class.forName(c.getName()).newInstance();
        return fruit;
    }
}
