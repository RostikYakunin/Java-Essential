package task3;

public class Vehicle {
    String name;
    int cost;
    int speed;
    int age;

    public Vehicle(String name, int cost, int speed, int age) {
        this.name = name;
        this.cost = cost;
        this.speed = speed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", speed=" + speed +
                ", age=" + age +
                '}';
    }
}
