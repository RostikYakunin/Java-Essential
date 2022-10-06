package task4;

public class Car {
    int age;
    String color;
    int weight;
    int speed;

    //empty constructor
    public Car() {
        this (10);
    }

    //constructor with one arg
    public Car(int age) {
        this( age , "Red");
    }

    //constructor with two args
    public Car(int age, String color) {
        this (age, color, 205);
    }

    //constructor with three args
    public Car (int age, String color, int weight) {
        this(age, color, weight, 100);
    }

    //constructor with four args
    public Car (int age, String color, int weight, int speed) {
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }
}
