package task3;

public class Main {
    public static void main(String[] args) {

        Plane plane1 = new Plane("Avrora", 1000, 200, 5, 10000, 50);
        Car car1 = new Car("BMW", 500, 200, 5);
        Ship ship1 = new Ship("Sun", 700, 150, 4, "Odessa", 40);

        System.out.println(plane1.toString());
        System.out.println(car1.toString());
        System.out.println(ship1.toString());

    }
}
