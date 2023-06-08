package org.lessons.java.animals;

class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Bau bau");
    }

    @Override
    public void eating() {
        System.out.println("I eat dog kibble");
    }
}
