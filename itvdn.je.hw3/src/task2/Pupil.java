package task2;

public class Pupil {
    // private fields
    private final String name;
    private final int age;

    //constructor
    public Pupil (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //methods
    void study () {

    }

    void read () {

    }

    void write (){

    }

    void relax () {

    }

    void voice () {
        System.out.println("Hello, my name is " + name +". I am " + age + " years old");
        study();
        read();
        write();
        relax();
    }

}
