package task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        //creating a new list
        ArrayList <Integer> list = new ArrayList<>();

        //add numbers for indexes
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(3);

        //output list to display
        System.out.println(list.toString());

        // using ListIterator
        ListIterator <Integer> iter = list.listIterator();

        //using loop while for output numbers + 1
        while (iter.hasNext()) {
            Integer in = iter.next();
            System.out.print(++in + " ");
        }







    }
}
