package Task5;
import Task5.Adress.*;

public class AdressMain {
    public static void main(String[] args) {

        Adress sobornay = new Adress();

        sobornay.setIndex("08124");
        sobornay.setCountry("Ukraine");
        sobornay.setCity("Kiev");
        sobornay.setStreet("Sobornay");
        sobornay.setHouse(13);
        sobornay.setApartment(24);

        System.out.println(sobornay.toString());
    }
}
