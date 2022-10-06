package task2;

public class TXTHandler extends  AbstractHandler{
    void open(){
        System.out.println("Your *.txt document is opened");
    }

    void create(){
        System.out.println("Your *.txt document can be created");
    }

    void change(){
        System.out.println("Your *.txt document can be changed");
    }

    void save(){
        System.out.println("Your *.txt document can be saved");
    }
}
