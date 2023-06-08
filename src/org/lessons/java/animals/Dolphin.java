package org.lessons.java.animals;

public class Dolphin extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Fifififi");
    }

    @Override
    public void eating() {
        System.out.println("I eat small fish");
    }
}
