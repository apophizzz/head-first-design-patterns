package com.acme.duck;

import com.acme.duck.behavior.fly.FlyNoWay;
import com.acme.duck.behavior.quack.MuteQuack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.quackBehavior = new MuteQuack();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
