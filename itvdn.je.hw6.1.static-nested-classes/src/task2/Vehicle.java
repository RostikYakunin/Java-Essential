package task2;

public class Vehicle {
    public void print () {
        System.out.println("Top Vehicle class");
    }

    //nested class Wheel
    static class Wheel {
        public void print () {
            System.out.println("Nested class Wheel");
        }
    }

    //nested class Door
    static class Door {
        public void print () {
            System.out.println("Nested class Door");
        }
    }
}
