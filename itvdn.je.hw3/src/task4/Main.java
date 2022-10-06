package task4;

import java.util.Scanner;

public class Main {
    static final int keyPro = 12345;
    static final int keyExp = 98765;

    public static void main(String[] args) {

        System.out.println("Welcome to the DocEditor");
        System.out.println("Add a key, if you have it for Pro or Exp version");
        System.out.println("If you haven`t the key, you will use free version");

        Scanner in = new Scanner(System.in);
        int key = in.nextInt();

        if (key==keyPro) {
            ProDocumentWorker docPro1 = new ProDocumentWorker();
            System.out.println("Welcome to the Pro version");
        }
        else if (key==keyExp) {
            ExpertDocumentWorker docExp1 = new ExpertDocumentWorker();
            System.out.println("Welcome to the Expert version");
        }
        else {
            DocumentWorker docWork1 = new DocumentWorker();
            System.out.println("Welcome to the free version");
        }





    }
}
