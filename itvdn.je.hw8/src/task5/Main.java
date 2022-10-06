package task5;
/*
        Используя Intelij IDEA создать проект, пакет.
        класс Animal с именем String, возрастом int, хвостом Boolean.
        В классе переопределить метод toString, что бы вывод был сдедующим
        «Имя: Васька, возраст: 45, хвост: нет».
        В классе Animal переопределить методы equals & hashCode.

 */

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Васька", 45, false);

        System.out.println(a.toString());

    }
}
