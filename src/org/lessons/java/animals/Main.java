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
            animal.sleep();
            System.out.println("");
        }
    }
}
