package task5;

public class Calculator {
    public double add (double a, double b) {
        return a+b;
    }

    public double mul (double a, double b) {
        return a*b;
    }

    public double sub (double a, double b) {
        return a-b;
    }

    public double div (double a, double b) {
        Exception ex = new Exception("Division be zero !");
        try {
            if(b == 0) throw ex;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
        return a/b;
    }
}
