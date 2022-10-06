package task2;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {

    MyList <String> list = new MyList <>();
    list.myAdd("1346");
    list.myAdd("23985");
    list.myAdd("345098");

    System.out.println(list.myGet(2));
    System.out.println(list.mySize());
    System.out.println(list.toString());

    }
}