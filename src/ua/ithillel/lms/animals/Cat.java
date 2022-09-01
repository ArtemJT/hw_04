package ua.ithillel.lms.animals;

public class Cat extends Animal {

    private static int countCats;

    public Cat(String name) {
        super(name);
        countCats++;
    }

    @Override
    public void run(int length) {
        int limitRun = 200;
        if (length <= limitRun && length > 0) {
            System.out.printf("%s пробежал %d м.\n", name, length);
        } else {
            System.out.printf("%s может пробежать только %d м.\n", name, limitRun);
        }
    }

    public static int getCountCats() {
        return countCats;
    }
}
