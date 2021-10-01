package Inheritance.HeirarchicalInheritance;

class Animal { // * Parent of two classes in a hierarchical manner.
    void sayMyName() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    Dog() {
        sayMyName();
    }
}

class Bird extends Animal {
    Bird() {
        sayMyName();
    }
}

public class Test {
    public static void main(String[] args) {
        new Dog();
    }
}
