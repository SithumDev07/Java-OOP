package Exceptions.UncheckedException;
// package Exceptions.BasicExample;

public class DemoException {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 8;
        j = 0;
        try {
            k = i / j;
        } catch (Exception e) { // * Unchecked Exception
            System.out.println("Cannot divide by zero");
        } // * Execution will flow
        System.out.println(k);
    }
}
