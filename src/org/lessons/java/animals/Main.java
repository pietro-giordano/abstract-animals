package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Sparrow sparrow = new Sparrow();
        Dolphin dolphin = new Dolphin();
        Animal[] animals = new Animal[]{dog, eagle, sparrow, dolphin};

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + ":");
            animal.eating();
            animal.makeNoise();
            if (animal instanceof CanFly) {
                makeFly((CanFly) animal);
            } else {
                makeSwim((CanSwim) animal);
            }
            animal.sleep();
            System.out.println("");
        }
    }

    // Methods
    public static void makeFly(CanFly animal) {
        animal.fly();
    }

    public static void makeSwim(CanSwim animal) {
        animal.swim();
    }
}
