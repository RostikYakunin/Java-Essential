package task3;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(2000);
        Car car3 = new Car(2005,"Red");
        Car car4 = new Car(2001, "Yellow", 2);
        Car car5 = new Car(2020, "White", 4, 100);

        System.out.println(car1);
        System.out.println(car2.age);
        System.out.println(car3.age + " " + car3.color);
        System.out.println(car4.age + " " + car4.color + " " + car4.weight);
        System.out.println(car5.age + " " + car5.color + " " + car5.weight + " " + car5.speed);
    }
}
