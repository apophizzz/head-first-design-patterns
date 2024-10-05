package com.acme.duck;

import com.acme.duck.behavior.fly.FlyNoWay;
import com.acme.duck.behavior.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
