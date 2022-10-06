package task2;

public class DOCHandler extends AbstractHandler{
    void open(){
        System.out.println("Your *.doc document is opened");
    }

    void create(){
        System.out.println("Your *.doc document can be created");
    }

    void change(){
        System.out.println("Your *.doc document can be changed");
    }

    void save(){
        System.out.println("Your *.doc document can be saved");
    }
}
