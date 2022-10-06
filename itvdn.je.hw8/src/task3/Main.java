package task3;
    /*
    Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе.
    Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы.
     */

public class Main {
    public static void main(String[] args) {

        Device a = new Device("Samsung", 120, "AB1234567CD");
        Monitor b = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
