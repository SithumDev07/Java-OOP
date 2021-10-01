package Extra.ImplicitConstructor;

//* If there is a constructor from parent class, when we create objects from child classes we have to call the super class constructor using super keyword.
//* super keyword should be in the constructor of the child class and the first line of statements.

class A {

    A() {
        System.out.println("Memo");
    }

    A(String k) {
        System.out.println("Me");
    }
}

class B extends A {
    // B() {
    // super();
    // }
}

// class First {
// A care() {
// System.out.println("From First");
// A a = new A();
// return a;
// }
// }

// class Second extends First {

// @Override
// B care() {
// System.out.println("From First");
// B b = new B();
// return b;
// }
// }

public class Test {
    public static void main(String[] args) {
        B b = new B();
        // Second second = new Second();
        // System.out.println(second.care());
    }
}
