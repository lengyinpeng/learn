package com.example.java8Demo;

@FunctionalInterface
public interface GreetingService<T> {
    String toString();
    void say(String message,String s);

    default void says(String a) {
        System.out.println(a);
    }
}
