package org.lessons.java.animals;

class Dog extends Animal implements CanSwim {
    @Override
    public void makeNoise() {
        System.out.println("Bau bau");
    }

    @Override
    public void eating() {
        System.out.println("I eat dog kibble");
    }

    @Override
    public void swim() {
        System.out.println("I swim");
    }
}
