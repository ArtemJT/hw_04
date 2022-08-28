package ua.ithillel.lms;

import ua.ithillel.lms.animals.Animal;
import ua.ithillel.lms.animals.Cat;
import ua.ithillel.lms.animals.Dog;

public class Main {

    public static void main (String[] args) {
        Dog dog = new Dog("Шарик");
        Cat cat = new Cat("Мурзик");

        dog.run(150);
        dog.swim(5);
        cat.run(180);

        dog = new Dog("Бобик");
        cat = new Cat("Кузя");

        cat.run(222);
        dog.run(555);
        dog.swim(15);

        cat = new Cat("Пушок");

        System.out.println("\nВсего было создано:");
        System.out.println("Собак: " + Dog.getCountDogs());
        System.out.println("Котов: " + Cat.getCountCats());
        System.out.println("Животных: " + Animal.getCountAnimals());
    }
}
