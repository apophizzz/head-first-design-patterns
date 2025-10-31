package com.acme.duck.behavior.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Awkward silence >>");
    }
}
