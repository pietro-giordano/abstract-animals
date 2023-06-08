package org.lessons.java.animals;

public class Dolphin extends Animal implements CanSwim {
    @Override
    public void makeNoise() {
        System.out.println("Fifififi");
    }

    @Override
    public void eating() {
        System.out.println("I eat small fish");
    }

    @Override
    public void swim() {
        System.out.println("I swim");
    }
}
