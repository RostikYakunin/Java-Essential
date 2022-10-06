package task2;

public abstract class AbstractHandler {

    void open(){

    }

    void create(){

    }

    void change(){

    }

    void save(){

    }

    void info () {
        open();
        create();
        change();
        save();
    }

}
