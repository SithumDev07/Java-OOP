package NestedClass.StaticInnerClasses;

class Outer {

    Outer() {
        System.out.println("I'm Outer");
    }

    void show() {
        System.out.println("Show method of Outer");
    }

    static class Inner {

        Inner() {
            System.out.println("I'm Inner");
        }

        void show() {
            System.out.println("Show method of Outer");
        }

        static class MostInner {

            MostInner() {
                System.out.println("I'm Most Inner");
            }

            void show() {
                System.out.println("Show method of Outer");
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) { // * To create instances from static classes, we do not need instances from
                                             // * outer classes.
        new Outer.Inner().show();

        // * Most Inner
        new Outer.Inner.MostInner().show();
    }
}
