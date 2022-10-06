package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Add a radius of your circle");

        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();

        MyArea.areaOfCircle(radius);
    }


}
