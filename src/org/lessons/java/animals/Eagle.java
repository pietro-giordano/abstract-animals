package org.lessons.java.animals;

public class Eagle extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Screech screech");
    }

    @Override
    public void eating() {
        System.out.println("I eat mice and snakes");
    }
}
