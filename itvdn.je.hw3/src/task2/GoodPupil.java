package task2;

public class GoodPupil extends Pupil{
    public GoodPupil(String name, int age) {
        super(name, age);
    }

    @Override
    void study () {
        System.out.println("I study good");
    }

    void read () {
        System.out.println("I read enough");
    }

    void write (){
        System.out.println("I write enough");
    }

    void relax () {
        System.out.println("I relax enough");
    }
}
