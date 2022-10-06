package task3;

public class Ship extends Vehicle{
    String port;
    int passengers;

    public Ship(String name, int cost, int speed, int age, String port, int passengers) {
        super(name, cost, speed, age);
        this.port = port;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Ship{" +

                "name='" + name + '\'' +
                ", cost=" + cost +
                ", speed=" + speed +
                ", age=" + age + ", port='" + port + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
