package task2;

import java.util.Arrays;

enum Animals {
    CAT(5),
    DOG(6),
    MOUSE(2),
    CAMEL(10),
    PARROT (3);

    private final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + super.toString() + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Animals.values()));

    }
}
