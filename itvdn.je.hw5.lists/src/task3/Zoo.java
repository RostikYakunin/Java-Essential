package task3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        //creating a new list
        ArrayList<String> list = new ArrayList<>();

        //add new animals in the list
        list.add(0,"Cat");
        list.add(1, "Dog");
        list.add(2,"Horse");
        list.add(3,"Lion");
        list.add(4,"Mouse");
        list.add(5,"Bat");
        list.add (6,"Bird");
        list.add(7, "Dinosaur");

        //output to the display all elements
        System.out.println(list.toString());

        //remove 3,5,7 animals
        list.remove("Horse");
        list.remove("Bat");
        list.remove("Dinosaur");

        //output to the display size of the list
        System.out.println(list.size());
        System.out.println(list.toString());







    }
}