// package Polymorphism.RuntimePolymorphism;

//* Static methods can't be overridden.
//* Use @override annotation for the overridden method, so if we don’t follow the overriding rules then the compiler will show the error.
//* If the parent method have the protected access modifier then the child can't have a lower one like private. but can have public.
//* If the parent method returns a class, the overridden method can return either that class or any subclass of that class.

class QuantumPhysics {

    String techStack = "MERN";

    QuantumPhysics() {

    }

    QuantumPhysics(String techStack) {
        System.out.println(techStack);
    }
}

class Science extends QuantumPhysics {

}

class Phone {
    QuantumPhysics print() {
        System.out.println("Phone");
        QuantumPhysics quantumPhysics = new QuantumPhysics();
        return quantumPhysics;
    }
}

class OnePlus extends Phone {
    @Override
    Science print() {
        System.out.println("One Plus");
        Science science = new Science();
        return science;
    }
}

public class Test {
    public static void main(String[] args) {
        OnePlus onePlus = new OnePlus();
        System.out.println(onePlus.print().techStack);
    }
}
