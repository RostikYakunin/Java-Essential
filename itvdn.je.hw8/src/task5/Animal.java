package task5;

import java.util.Objects;

/*
        Используя Intelij IDEA создать проект, пакет.
        класс Animal с именем String, возрастом int, хвостом Boolean.
        В классе переопределить метод toString, что бы вывод был сдедующим
        «Имя: Васька, возраст: 45, хвост: нет».
        В классе Animal переопределить методы equals & hashCode.

 */
public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", возраст: " + age + ", хвост " + (tail?"есть":"нет") ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
