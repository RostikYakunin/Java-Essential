package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the calculator");
        System.out.println("Input first number ");
        int number1 = in.nextInt();

        System.out.println("Input operation : <+>, <->, <*>, </>");
        char operation = in.next().charAt(0);

        System.out.println("Input second number");
        int number2 = in.nextInt();

        switch (operation) {
            case '+':
                System.out.println("Sum = " + calculator.add(number1,number2));
                break;
            case '-':
                System.out.println("Sub = " + calculator.sub(number1,number2));
                break;
            case '*':
                System.out.println("Mul = " + calculator.mul(number1, number2));
                break;
            case '/':
                System.out.println("Div = " + calculator.div(number1, number2));
                break;
            default:
                try {
                    throw new Exception("Input ERROR in operation");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
        }
    }
}
