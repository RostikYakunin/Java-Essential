package task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <String> listOfTeachers = new ArrayList<>();
        listOfTeachers.add ("Tatyana Nikolaevna");
        listOfTeachers.add("Irina Grigorievna");
        listOfTeachers.add("Inna Alexsandrovna");
        listOfTeachers.add("Anna Antonovna");
        listOfTeachers.add("Elena Anatolievna");
        listOfTeachers.add("Olga Ivanovna");

        System.out.println(listOfTeachers.indexOf("Anna Antonovna"));
        System.out.println(listOfTeachers.indexOf("Tatyana Nikolaevna"));
        System.out.println(listOfTeachers.toString());

    }
}
