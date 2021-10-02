package Exceptions.Throws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException {
    public static void main(String[] args) throws IOException {
        int i = 8;
        int j = 0;
        int k = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter a number");
            j = Integer.parseInt(bufferedReader.readLine());
            k = i + j;
            if (k < 10) {
                throw new ArithmeticException();
            }
            System.out.println("Output is " + k);
        } catch (IOException e) {

        } catch (ArithmeticException e) {
            System.out.println("Minimum value for the output is 10");
        }
    }
}
