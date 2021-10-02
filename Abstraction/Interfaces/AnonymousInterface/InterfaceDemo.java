package Abstraction.Interfaces.AnonymousInterface;

//* We know that if we implement an interface and override their methods, we need a separate class for that.
//* But if we want to override those methods just for once, we can use anonymous classes.

interface Vogue {
    void apply();
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vogue vogue = new Vogue() { // * Here we are making anonymous class since we cannot make constructors. That
                                    // * means we cannot create objects / instances from interfaces.
            @Override
            public void apply() {
                System.out.println("Ontime application");
            }
        };
        vogue.apply();
    }
}
