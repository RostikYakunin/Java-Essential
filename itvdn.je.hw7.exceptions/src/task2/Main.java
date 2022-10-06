package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //static field for numeration workers
    static int a = 1;

    //method for creating workers
    public static Worker workersMaker (Worker[] workers) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input surname with initials of " + a++ + " worker, " +
                    "his position and age of start of work");

        //exceptions` handler
        try {
            return new Worker(in.nextLine(), in.nextLine(), in.nextInt());
        } catch (Exception e) {
            System.out.println("Mistake ! You can`t write words in the number field");
        }
       return new Worker(in.nextLine(), in.nextLine(), in.nextInt());
    }

    // method for find a worker
    public static String searcherOfWorkers (Worker[] workers) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input worker`s age of work start for find his surname");
        int a = in.nextInt();
        for (Worker work : workers) {
            if (a == work.getAgeOfStart()) {
                return work.getSurnameInitials();
            }
        }
        return "Not found";
    }

        public static void main(String[] args) {

        Worker [] workers = new Worker[5];
        workers [0] = workersMaker(workers);
        workers [1] = workersMaker(workers);
        workers [2] = workersMaker(workers);
        workers [3] = workersMaker(workers);
        workers [4] = workersMaker(workers);

        //searcher
        System.out.println("Surname of this worker: " + searcherOfWorkers(workers));
    }
}
