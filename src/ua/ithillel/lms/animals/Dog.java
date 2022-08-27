package ua.ithillel.lms;

public class Dog extends Animal {

    private final String name;
    private static int countDogs;

    public Dog (String name) {
        super();
        this.name = name;
        countDogs++;
    }

    @Override
    protected void run (int length) {
        int limitRun = 500;
        if (length <= limitRun && length > 0) {
            System.out.printf("%s пробежал %d м.\n", name, length);
        } else {
            System.out.printf("%s может пробежать только %d м.\n", name, limitRun);
        }
    }

    @Override
    protected void swim (int length) {
        int limitSwim = 10;
        if (length <= limitSwim && length > 0) {
            System.out.printf("%s проплыл %d м.\n", name, length);
        } else {
            System.out.printf("%s может проплыть только %d м.\n", name, limitSwim);
        }
    }

    public static int getcountDogs () {
        return countDogs;
    }
}
