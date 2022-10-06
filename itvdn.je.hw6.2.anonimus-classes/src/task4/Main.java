package task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vehicles v1 = Vehicles.CAR;
        Vehicles v2 = Vehicles.CYCLE;
        Vehicles v3 = Vehicles.MOTORCYCLE;
        Vehicles v4 = Vehicles.PLANE;
        Vehicles v5 = Vehicles.TRAIN;
        v1.setColor("Red");
        v2.setColor("Blue");
        v3.setColor("Yellow");
        v4.setColor("Green");
        v5.setColor("Grey");

        System.out.println(Arrays.toString(Vehicles.values()));
    }
}
