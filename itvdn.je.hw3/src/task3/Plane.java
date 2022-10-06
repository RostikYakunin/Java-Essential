package task3;

public class Plane extends Vehicle{

    int height;
    int passengers;

    public Plane(String name, int cost, int speed, int age, int height, int passengers) {
        super(name, cost, speed, age);
        this.height = height;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Plane{" +

                "name='" + name + '\'' +
                ", cost=" + cost +
                ", speed=" + speed +
                ", age=" + age + ", height=" + height +
                ", passengers=" + passengers +
                '}';
    }
}
