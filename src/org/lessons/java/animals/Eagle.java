package org.lessons.java.animals;

public class Eagle extends Animal implements CanFly {
    @Override
    public void makeNoise() {
        System.out.println("Screech screech");
    }

    @Override
    public void eating() {
        System.out.println("I eat mice and snakes");
    }

    @Override
    public void fly() {
        System.out.println("I fly");
    }
}
