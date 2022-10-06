package task3;


public class Car {
    int age;
    String color;
    int weight;
    int speed;

    //empty constructor
    public Car() {
    }

    //constructor with one arg
    public Car(int age) {
        this.age = age;
    }

    //constructor with two args
    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }

    //constructor with three args
    public Car (int age, String color, int weight) {
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    //constructor with four args
    public Car (int age, String color, int weight, int speed) {
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }
}
