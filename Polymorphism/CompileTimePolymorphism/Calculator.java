package Polymorphism.CompileTimePolymorphism;

//* Polymorphism is the ability of a variable, function or an object to take multiple forms.
//* In Compile time polymorphism method overloading.
//* Also method overloading can happen in inheritance.
public class Calculator {
    void add(int i, int j) {
        System.out.println(i + j);
    }

    void add(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    // * Only thing we can change is parameters.
    // int add(int i, int j) {

    // }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(12, 8);
        calculator.add("Sithum", "Dashantha");
    }
}
