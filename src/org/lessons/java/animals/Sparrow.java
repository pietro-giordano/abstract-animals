package org.lessons.java.animals;

public class Sparrow extends Animal implements CanFly {
    @Override
    public void makeNoise() {
        System.out.println("Cip cip");
    }

    @Override
    public void eating() {
        System.out.println("I eat seeds");
    }

    @Override
    public void fly() {
        System.out.println("I fly");
    }
}
