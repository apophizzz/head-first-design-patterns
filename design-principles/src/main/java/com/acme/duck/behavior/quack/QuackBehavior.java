package com.acme.duck.behavior.quack;

public interface QuackBehavior {
    default void quack() {
        System.out.println("Quack");
    }
}
