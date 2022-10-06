package task2;
import java.util.Scanner;

public class ClassRoom {

    // set name for pupils
    static String setName() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    //set age for pupils
    static int setAge() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the classroom with four pupils !");
        System.out.println("You must give name for all pupils and their age");

        System.out.println("Set name and age for the first pupil");
        Pupil pupil1 = new ExcellentPupil(setName(), setAge());

        System.out.println("Set name and age for the second pupil");
        Pupil pupil2 = new GoodPupil(setName(), setAge());

        System.out.println("Set name and age for the third pupil");
        Pupil pupil3 = new BadPupil(setName(), setAge());

        System.out.println("Set name and age for the fourth pupil");
        Pupil pupil4 = new GoodPupil(setName(), setAge());

        pupil1.voice();
        System.out.println();

        pupil2.voice();
        System.out.println();

        pupil3.voice();
        System.out.println();

        pupil4.voice();
        System.out.println();
    }
}
