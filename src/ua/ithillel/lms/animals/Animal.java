package ua.ithillel.lms.animals;

public class Animal {

    private static int countAnimals;

    protected Animal () {
        countAnimals++;
    }

    public static int getCountAnimals () {
        return countAnimals;
    }

    protected void run (int length) {}

    protected void swim (int length) {}
}
