package com.acme.duck;

import com.acme.duck.behavior.fly.FlyWithWings;
import com.acme.duck.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

