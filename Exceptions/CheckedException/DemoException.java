package Exceptions.CheckedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException {
    public static void main(String[] args) {
        int i, j, k = 0;
        int a[] = new int[4];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        i = 8;

        try {
            j = Integer.parseInt(bufferedReader.readLine());
            k = i / j; // * When the error occured the compiler jump into catch statement.
            for (int c = 0; c <= 4; c++) {
                a[c] = c + 1;
            }
            for (int value : a) {
                System.out.println(value);
            }
        } catch (IOException e) {
            System.out.println("Some IO Error" + e);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Maximm number of value is 4 " + e);
        } catch (Exception e) {
            System.out.println("Unknown exception " + e);
        }
        System.out.println(k);
    }
}
