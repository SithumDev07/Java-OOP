package Extra.ConstructorChaining;

//* Constructor chaining is the process of calling one constructor from another constructor with respect to current object. 
//* Within same class: It can be done using this() keyword for constructors in same class
// * Rules for constructor chaining
//*     The this() expression should always be the first line of the constructor.
//*     There should be at-least be one constructor without the this() keyword.
//*     Constructor chaining can be achieved in any order.

class Temp {
    Temp() {
        this(52.36);
    }

    Temp(Double value) {
        this("Farenhite", 75.23);
        System.out.println(value);
    }

    Temp(String unit, Double amount) {
        System.out.println(unit + " " + amount);
    }
}

public class Test {
    public static void main(String[] args) {
        new Temp();
    }
}
