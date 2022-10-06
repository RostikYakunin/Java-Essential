package task2;

public class ExcellentPupil extends Pupil{
    public ExcellentPupil(String name, int age) {
        super(name, age);
    }

    @Override
    void study () {
        System.out.println("I study excellent");
    }

    void read () {
        System.out.println("I read a lot");
    }

    void write (){
        System.out.println("I write a lot");
    }

    void relax () {
        System.out.println("I relax a little");
    }
}
