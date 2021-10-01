package Abstraction.AbstractClasses.BasicExample;

//* Abstract classes have both abstract and concrete methods. If the method is abstract then the method can't have a mehtod body.
//* When we extend an abstract class we have to override all the abstract method event those mehtods are not doing at all.
//* Also can use final method which can't change by child classes by overriding.
//* Can't create any instances from abstract classes.

abstract class Shape {

    Shape() {
        System.out.println("Im here");
    }

    abstract void draw();

    void hello() {
        System.out.println("Hi");
    }

    abstract void calculateArea();

    final void uCantChangeMe() {
        System.out.println("Blah");
    }
}

class Square extends Shape {
    private double side;
    private double area;

    Square(double side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void calculateArea() {
        System.out.println("Calculating Area");
        area = side * side;
    }

    public double getArea() {
        return area;
    }
}

public class Test {
    public static void main(String[] args) {
        Square s = new Square(5.69);
        s.calculateArea();
        System.out.println(s.getArea());
        s.hello();
    }
}
