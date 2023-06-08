package org.lessons.java.animals;

public class Sparrow extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Cip cip");
    }

    @Override
    public void eating() {
        System.out.println("I eat seeds");
    }
}
