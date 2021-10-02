
public class DemoException {
    public static void main(String[] args) {
        int i = 5;
        try {
            if (i < 10) {
                throw new MyException("Number should be greater than 10");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MyException extends Exception {
    MyException(String error) {
        super(error);
    }
}
