package task2;

public class XMLHandler extends AbstractHandler {
    void open(){
        System.out.println("Your *.xml document is opened");
    }

    void create(){
        System.out.println("Your *.xml document can be created");
    }

    void change(){
        System.out.println("Your *.xml document can be changed");
    }

    void save(){
        System.out.println("Your *.xml document can be saved");
    }
}
