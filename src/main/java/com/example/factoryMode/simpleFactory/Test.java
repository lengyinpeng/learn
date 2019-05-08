package com.example.factoryMode.simpleFactory;

/**
 * @author zpp
 * 测试工厂类
 * */
public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * 简单工厂测试
         */

        Fruit apple = SimpleFactory.createFruit("apple");
        apple.show();
        Fruit banana = SimpleFactory.createFruit("banana");
        banana.show();
        /**
         * 反射简单工厂测试
         */
        Fruit apple1 = SimpleFactoryReflex.createFruit(Apple.class);
        apple1.show();
        Fruit b1 = SimpleFactoryReflex.createFruit(Banana.class);
        b1.show();
    }
}
