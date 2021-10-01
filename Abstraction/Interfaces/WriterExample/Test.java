package Abstraction.Interfaces.WriterExample;

//* Inside interfaces all the methods / variables are public and abstract.
//* Also the methods declared inside interfaces can't have method body.
//* All the fields (Variables) are public, static and final by default.
//* Only the default methods can have a method body.
//* Interfaces don't have a constructor.
//* Similar to the abstract classes we cannot create any instances of interfaces.

interface Writer {
    public abstract void write();

    void show(); // * The compiler will add public and abastract infront of this method.

    public static final String madeOf = "Atlas";
    int SerialNumber = 458545159; // * The compiler will add public static final infront of this field.

    default void message() {
        System.out.println("This is the default message");
    }
}

class Pen implements Writer {

    @Override
    public void write() { // * Similar to abstract classes we have to override all the methods from
                          // * interface. Also the access modifier of the overridden method should be
                          // * public.
        System.out.println("Writing from Ink Pen");
    }

    @Override
    public void show() {
        System.out.println("Showing the Pen");
    }
}

class Kit {
    void doSomething(Writer writer) { // * Since we can't create instances from interfaces , somehow we can pass any
                                      // * instance which implements the interface.
        writer.write();
        writer.show();
    }
}

public class Test {
    public static void main(String[] args) {
        Pen pen = new Pen(); // * Pen class is implementing Writer interface.
        new Kit().doSomething(pen); // * So we can pass pen instance as the parameter for Kit class.
        pen.show(); // * It is also fine to do in the regular way.
    }
}
