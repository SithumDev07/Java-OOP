package NestedClass.InnerClasses;

class Outer {
    Outer() {

    }

    void show() {
        System.out.println("Show method of Outer");
    }

    class Inner {
        Inner() {

        }

        void show() {
            System.out.println("Show method of Inner");
        }

        class MostInner {
            MostInner() {

            }

            void show() {
                System.out.println("Show method of Most Inner");
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        new Outer().new Inner().new MostInner().show();
    }
}