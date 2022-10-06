package task3;

public class Main {
    public static void main(String[] args) {


        Distance d1 = new Distance();
        d1.setDistance(1000);

        Distance.Converter dc1 = new Distance.Converter();
        System.out.println(dc1.convertFromMeterToKilometer());

    }
}
