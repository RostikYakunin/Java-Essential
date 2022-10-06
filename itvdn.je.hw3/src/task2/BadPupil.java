package task2;

public class BadPupil extends Pupil{
    public BadPupil(String name, int age) {
        super(name, age);
    }

    @Override
    void study () {
        System.out.println("I don`n like study");
    }

    void read () {
        System.out.println("I don`n like read");
    }

    void write (){
        System.out.println("I don`n like write");
    }

    void relax () {
        System.out.println("I very like relax");
    }
}
