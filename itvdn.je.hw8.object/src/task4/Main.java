package task4;
        /*
        Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе.
        Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы.
        */
public class Main {
    public static void main(String[] args) {

        Device a = new Device("Samsung", 120, "AB1234567CD");
        Monitor b = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        EthernetAdapter c = new EthernetAdapter("LG", 100, "ND1538567CD", 100, "MAC");

        System.out.println("Methods toString");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        System.out.println("----------------------------------");
        System.out.println("Methods hashCode");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        System.out.println("----------------------------------");
        System.out.println("Methods equals");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(a));


    }
}
