package Extra.ConstructorChaining;

//* Constructor chaining when inheritance occur.
//* Similar to constructor chaining in same class, super() should be the first line of the constructor as super class’s constructor are invoked before the sub class’s constructor.

class Base {
    String name;

    Base() {
        this("Hello");
    }

    Base(String name) {
        this.name = name;
        System.out.println("Gotcha " + name);
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Nothing");
    }

    Derived(String name) {
        super(name);
        System.out.println("Get Name");
    }
}

public class OtherWay {
    public static void main(String[] args) {
        new Derived("Hello");
    }
}
