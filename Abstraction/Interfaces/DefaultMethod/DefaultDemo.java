package Abstraction.Interfaces.DefaultMethod;

//* When we consider abstract classes and interfaces only difference is, in abstract classes we can define abstract methods (Without method body) or regular methods. 
//* But in interfaces we can't achieve that. Only thing can do is define methods.

interface Demo {
    void print();

    default void show() {
        System.out.println("In show");
    }
}

class DemoImpl implements Demo {
    @Override
    public void print() {
        System.out.println("Print method overriding");
    }

    @Override
    public void show() {// * Also we can override default methods.
        System.out.println("Overriding default show method");
    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        new DemoImpl().show();
    }
}
