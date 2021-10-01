package Inheritance.MultiLevelInheritance.RealCalculator;

// * inheritance is the process by which one object acquires the properties of
// * another object.

class Calculator {
    String name = "White";

    Calculator() { // * When we create an object from child class, the default constructors of
                   // * parent classes are also executed.
        System.out.println("Parent Calculator");
    }

    protected int add(int i, int j) { // * child can only access if methods and variables are not private, it can
                                      // * either be public or protected.
        return i + j;
    }
}

class CalculatorAdvanced extends Calculator {

    CalculatorAdvanced() {
        System.out.println("Advanced Calculator");
    }

    void printName() {
        System.out.println(super.name); // * Can access parent class not private variables by using super keyword.
    }

    public int sub(int i, int j) {
        return i - j;
    }

    public static void main(String[] args) {
        CalculatorAdvanced calculatorAdvanced = new CalculatorAdvanced();
        calculatorAdvanced.printName();
    }
}

class CalculatorPro extends CalculatorAdvanced {
    public int multiply(int i, int j) {
        return i * j;
    }
}

public class RealCalculator {
    public static void main(String[] args) {
        CalculatorPro calculatorPro = new CalculatorPro();

        System.out.println(calculatorPro.add(12, 45));
    }
}
