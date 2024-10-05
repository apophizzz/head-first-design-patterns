package com.acme.duck;

import com.acme.duck.behavior.fly.FlyRocketPowered;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DuckTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private final MallardDuck mallardDuck = new MallardDuck();
    private final RubberDuck rubberDuck = new RubberDuck();
    private final ModelDuck modelDuck = new ModelDuck();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testMallardDuckQuack() {
        mallardDuck.performQuack();
        Assertions.assertEquals("Quack", outputStreamCaptor.toString().trim());
    }

    @Test
    void testMallardDuckFly() {
        mallardDuck.performFly();
        Assertions.assertEquals("I'm flying!!", outputStreamCaptor.toString().trim());
    }

    @Test
    void testMallardDuckDisplay() {
        mallardDuck.display();
        Assertions.assertEquals("I'm a real Mallard duck", outputStreamCaptor.toString().trim());
    }

    @Test
    void testRubberDuckQuack() {
        rubberDuck.performQuack();
        Assertions.assertEquals("<< Awkward silence >>", outputStreamCaptor.toString().trim());
    }

    @Test
    void testRubberDuckFly() {
        rubberDuck.performFly();
        Assertions.assertEquals("Oops, I can't fly", outputStreamCaptor.toString().trim());
    }

    @Test
    void testRubberDuckDisplay() {
        rubberDuck.display();
        Assertions.assertEquals("I'm a rubber duck", outputStreamCaptor.toString().trim());
    }

    @Test
    void testModelDuckDefaultFly() {
        modelDuck.performFly();
        Assertions.assertEquals("Oops, I can't fly", outputStreamCaptor.toString().trim());
    }

    @Test
    void testModelDuckFlyingOnSteroids() {
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        Assertions.assertEquals("I'm flying with a rocket!!", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
