package task2;

import java.util.Arrays;

public class MyList <E> {
    private E e;
    private static int i = 0;
    Object [] castomArray = new Object[10];

    public MyList() {

    }

    //method index
    public Object myGet (int index) {
        if (castomArray[index] != null) return castomArray[index];
        else throw new ArrayIndexOutOfBoundsException("Index not found");
    }

    //method add
    public void myAdd(E add){
        this.castomArray[i++] = add;
    }

    //method size
    public int mySize () {
        int sum = 0;

        for (Object a :this.castomArray) {
            if (a != null) sum += 1;
            else return sum;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "castomArray=" + Arrays.toString(castomArray) +
                '}';
    }
}
