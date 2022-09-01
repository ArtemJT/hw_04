package ua.ithillel.lms.animals;

public class Animal {

    protected final String name;
    private static int countAnimals;

    protected Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    protected void run(int length) {}

    protected void swim(int length) {}
}
