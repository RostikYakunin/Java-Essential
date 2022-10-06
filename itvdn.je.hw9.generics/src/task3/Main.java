package task3;

public class Main {
    public static void main(String[] args) {

        MyDictionary<String, String> dictionary = new MyDictionary<>();
        dictionary.add("ASDF", "dgfdh");
        dictionary.add("fdgs","sgdsgsgd");
        dictionary.add("qwer","asdfg");

        System.out.println(dictionary.showAll());
        System.out.println(dictionary.getObjectById(1));
    }
}
