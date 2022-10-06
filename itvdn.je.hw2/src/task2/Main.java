package task2;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(); //call of empty constructor
        Car bmp = new Car(2000); // call of first constructor
        Car mers = new Car(2010, "Red"); // call of second constructor

        System.out.println( bmw + "\n" + bmp.age + "\n" + mers.age + " " + mers.color );





    }
}
