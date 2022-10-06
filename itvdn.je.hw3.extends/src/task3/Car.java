package task3;

public class Car extends Vehicle{
    public Car(String name, int cost, int speed, int age) {
        super(name, cost, speed, age);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", speed=" + speed +
                ", age=" + age +
                '}';
    }
}
