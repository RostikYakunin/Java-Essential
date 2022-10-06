package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the programme \"Document hanler\" ");
        System.out.println("Input document`s type for a work");
        System.out.println("Examples: doc or txt or xml");

        Scanner in = new Scanner(System.in);
        String str = in.next();

        switch (str) {

            case "doc":
                AbstractHandler docDoc = new DOCHandler();
                docDoc.info();
                break;
            case "txt":
                AbstractHandler docTxt = new TXTHandler();
                docTxt.info();
                break;
            case"xml":
                AbstractHandler docXml = new XMLHandler();
                docXml.info();
                break;
            default:
                System.out.println("Invalid input");

        }







    }
}
