package Task2;

import java.util.Scanner;

public class Rectangle {

    static double areaCalculator (double side1, double side2){
        return side1+side2;
    }

    static double perimeterCalculator (double side1, double side2){
        return side1*side2;
    }

    public static void main(String[] args) {

        double side1;
        double side2;
        Scanner in = new Scanner(System.in);

        System.out.println("Добро пожаловать в домашнее задание №2");
        System.out.println("Введите первую сторону прямоугольника");
        side1 = in.nextDouble();

        System.out.println("Введите вторую сторону прямоугольника");
        side2 = in.nextDouble();

        System.out.println("Площадь заданого прямогульника = " + areaCalculator(side1,side2));
        System.out.println("Периметр заданого прямоугольника = " + perimeterCalculator(side1,side2));


    }
}
