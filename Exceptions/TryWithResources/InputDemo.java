package Exceptions.TryWithResources;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//* Try with resources

public class InputDemo {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = "";
            string = bufferedReader.readLine();
        }
    }
}
