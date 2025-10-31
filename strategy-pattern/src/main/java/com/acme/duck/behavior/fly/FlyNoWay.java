package com.acme.duck.behavior.fly;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Oops, I can't fly");
    }
}
