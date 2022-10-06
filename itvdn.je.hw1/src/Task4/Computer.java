package Task4;

public class Computer {
    public static void main(String[] args) {

    Computers[] comps = new Computers[5];

    comps [0] = new Computers("Asus");
    comps [1] = new Computers("Dell");
    comps [2] = new Computers("Acer");
    comps [3] = new Computers("HP");
    comps [4] = new Computers("Apple");

        for (int i = 0; i < comps.length; i++) {
            System.out.println("Массив обектов с индекcом " + i + " = " + comps[i].name);
        }
    }
}

class Computers {
    String name;
    Computers (String name) {
        this.name = name;
    }
}