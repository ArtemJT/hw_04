package ua.ithillel.lms;

public class Cat extends Animal {

    private final String name;
    private static int countCats;

    public Cat (String name) {
        super();
        this.name = name;
        countCats++;
    }

    @Override
    protected void run (int length) {
        int limitRun = 200;
        if (length <= limitRun && length > 0) {
            System.out.printf("%s пробежал %d м.\n", name, length);
        } else {
            System.out.printf("%s может пробежать только %d м.\n", name, limitRun);
        }
    }

    @Override
    protected void swim (int length) {
        System.out.printf("%s не умеет плавать.\n", name);
    }

    public static int getCountCats () {
        return countCats;
    }
}
