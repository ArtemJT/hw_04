package ua.ithillel.lms.animals;

public class Dog extends Animal {

    private static int countDogs;

    public Dog(String name) {
        super(name);
        countDogs++;
    }

    @Override
    public void run(int length) {
        int limitRun = 500;
        if (length <= limitRun && length > 0) {
            System.out.printf("%s пробежал %d м.\n", name, length);
        } else {
            System.out.printf("%s может пробежать только %d м.\n", name, limitRun);
        }
    }

    @Override
    public void swim(int length) {
        int limitSwim = 10;
        if (length <= limitSwim && length > 0) {
            System.out.printf("%s проплыл %d м.\n", name, length);
        } else {
            System.out.printf("%s может проплыть только %d м.\n", name, limitSwim);
        }
    }

    public static int getCountDogs() {
        return countDogs;
    }
}
