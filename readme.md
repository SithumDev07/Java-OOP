# Object Oriented Programming

### Java Classes

A class in Java is a blueprint which includes all your data. A class contains fields (variables) and methods to describe the behavior of an object.

### Java Objects

An object is a major element in a class which has a state and behavior. It is an instance of a class which can access your data. The ‘new’ keyword is used to create the object.

### Constructor

A constructor is a block of code that initializes a newly created object. It is similar to a method in Java but doesn’t have any return type and its name is the same as the class name.

Default Constructor - This constructor is created by default by the java compiler at the time of class creation if no other constructor is declared in the class. Sometimes its also called no-argument constructor as it doesn’t contain any parameters.

    class Test{
        // Added by the Java Compiler at the Run Time
        public Test(){ 
        }
        public static void main(String args[]) {
            Test testObj = new Test();
        }
    }

Parameterized Constructor - This constructor is called parameterized as it contains one or more parameters. It is used to provide different values to the distinct objects at the time of their creation.

### Access Modifiers

Java access modifiers specify the scope of accessibility of a data member, method, constructor or class.

![alt text](https://miro.medium.com/max/700/1*NcQ3U-P7nHbhiHGGLSS-iw.png)

### Non Access Modifiers

The non-access modifiers in Java, do not change the accessibility of variables and methods rather they provide special properties. These modifiers can alter the behavior of elements as well.

![alt text](https://miro.medium.com/max/700/1*UjM90GYqrimjhB1p4WRENg.png)


### Inheritance

Inheritance is the property of a child/derived/subclass which allows it to inherit the properties(data members) and functionalities(methods) from its parent/base/superclass.

* All objects have the Object class as their top parent.

* Methods can be overridden but attributes can not.

* To call a parent class constructor, super() is used.

Java supports 5 types of inheritance:

* Single Level Inheritance
* Multi-Level Inheritance
* Hierarchical Inheritance
* Hybrid Inheritance
* Multiple Inheritance

#### Single Inheritance

    Class A{
    //your parent class code
    }
    Class B extends A {
    //your child class code
    }

#### Multi-Level Inheritance - In multi-level inheritance, one class has more than one parent class but at different levels of inheritance

    Class A{
    //your parent class code
    }
    Class B extends A {
    //your code
    }
    Class C extends B {
        //your code 
    }

#### Hierarchical Inheritance

    Class A{
    //your parent class code
    }
    Class B extends A {
    //your child class code
    }
    Class C extends A {
        //your child class code 
    }

#### Hybrid Inheritance - Hybrid Inheritance is the combination of more than one type of inheritance in a single program, for example, you can combine a multilevel inheritance with a hierarchical inheritance.

            A
            / 
        B     C
        /       \  
        D          E

#### Multiple Inheritance

Multiple inheritance is not supported in Java as it leads to the diamond problem. The diamond problem is an ambiguity where the compiler doesn’t know which superclass method to execute in case the superclasses has a method with the same name.

* But multiple inheritance in Java can be achieved using interfaces.

### Polymorphism

Polymorphism is the ability of a variable, function or an object to take multiple forms. It allows you to define one interface or method and have multiple implementations. There are two types of polymorphism in Java.

Two types,

1. Compile time polymorphism
2. Run time polymorphism

#### Compile Time Polymorphism

Method overloading means two or more methods in a class having the same name but different parameters(arguments).
Also called static binding, as the type of the object is determined at the compile time by the compiler itself. Example: Method Overloading.
Methods may or may not have a different return type.
Method overloading reduces duplicate code and allows us to use the same method name for different purposes.
Method overloading is also called Compile time polymorphism because, at the time of compiling the code, the compiler decides which method is going to be called based on the method name, return type, and arguments.
Overloading can also happen in the case of inheritance. This is because the Child class already has one version of inherited methods from the parent class and can also write another overloaded version of that method.

##### Rules for Method Overloading

* Methods must have the same name but different method signatures (different number of arguments, different types of arguments, a different sequence of arguments).

* Overloaded methods may or may not have a different return type.

* Overloaded methods may or may not have different access modifiers.

* Overloaded methods may or may not throw different checked or unchecked Exceptions.

        class Calculator {
            static int add(int a, int b){
                return a+b;
            }

            static double add( double a, double b){
                return a+b;
            }

            public static void main(String args[]){
                System.out.println(Calculator.add(123,17));
                System.out.println(Calculator.add(18.3,1.9));
            }
        }

#### Runtime Polymorphism

Also called dynamic binding as the overridden method is resolved at runtime rather than compile-time. In this, a reference variable is used to call an overridden method of a superclass at run time. Example: Method Overriding.

##### Method Overriding

Method overriding is defining a method in the child class with the same method name and same method signature which is already written in the parent class.
Return type of overridden method can be a subtype of the return type of parent class method.

* E.g. If the parent class method returns Vehicle then Subclass’s overridden method’s return type can be any subclass of Vehicle class, for example, Car can be a return type of overridden method in child class. (Assuming Vehicle as parent class and Car as a child class of Vehicle class).

It can’t have a lower access modifier.

E.g. If the parent class method has a protected access modifier then the child class overridden method cannot have a private access modifier, but the public is allowed.

Use @override annotation for the overridden method, so if we don’t follow the overriding rules then the compiler will show the error.
Method overriding is called Dynamic Polymorphism because the method which is going to be called is decided at run time by the JVM.
Static methods can’t be overridden, only instance methods are overridden.


    public class Mobile{
        void sms(){
            System.out.println("Mobile class");
        }

    }

        //Extending the Mobile class
    public class OnePlus extends Mobile{
        //Overriding sms() of Mobile class
        void sms(){
            System.out.println(" OnePlus class");
        }

        public static void main(String[] args)
        {
            OnePlus smsObj= new OnePlus();
            smsObj.sms();
        }
    }

### Abstraction

Abstraction is the process of hiding the details and showing only the necessary things to the user. You can achieve abstraction in two ways in Java:

1. Using abstract classes
2. Using interfaces

Example: A real-life example of abstraction can be using an electric circuit board. We use the buttons to turn on and off the electrical devices through the circuit board. We know a lot of things happen inside the board. Here we are using the functionality provided and we aren't interested in the actual working of the circuit board.

Now let’s relate this example with classes and interface. The surface of the electric board is an Interface and the actual implementation of the electric circuit board is a class.

#### Abstract Classes

Abstract Class is a class which is declared with an abstract keyword and cannot be instantiated. Few pointers to create an abstract class:

* It can contain abstract and non-abstract methods.

* It can contain constructors and static methods as well.

* It can contain final methods which force the subclass not to change the body of the method.

        public abstract class MyAbstractClass 
        {
            public abstract void abstractMethod();
            public void display(){ System.out.println("Concrete method");  }
        }

* Can't create any instances from abstract classes.

#### Interface

An interface in java is a blueprint of a class that contains static constants and abstract methods. It represents the IS-A relation. You need to implement an interface to use its methods or constants.

Since Java is not supporting multiple inheritance, interfaces is the way to achieve multiple inheritance.

* Similar to the abstract classes we cannot create any instances of interfaces.

        //Creating an Interface
        public interface Bike { public void start(); }

        //Creating classes to implement Bike interface
        class Honda implements Bike{
            public void start() { System.out.println("Honda Bike"); }
        }

        class Apache implements Bike{
            public void start() { System.out.println("Apache Bike"); }
        }

        class Rider{
            public static void main(String args[]){ 
                Bike b1=new Honda(); 
                b1.start();
                Bike b2=new Apache();
                b2.start(); 
            }
        }

##### When to use interfaces instead of abstract classes?

* When we talk about abstract classes we are defining the characteristics of an object type and specify what an object is.

* When we talk about an interface, we define the capabilities that we promise to provide. We are talking about establishing a contract about what an object can do.

#### Encapsulation

Encapsulation is a process of binding your data and code together as a single unit using getter and setter methods.

Steps to achieve encapsulation,

* Declare the variables of a class as private.
* Provide public setter and getter methods to modify and view the values of the variables.

        public class Artist {

            private String name;

            //getter method
            public String getName() { return name; }

            //setter method
            public void setName(String name) { this.name = name; }

        }

        public class Show{

            public static void main(String[] args){

                //creating instance of the encapsulated class
                Artist s=new Artist(); 
                //setting value in the name member 
                s.setName("V"); 
                //getting value of the name member 
                System.out.println(s.getName()); 

            } 
        }

### Exception Handling

An exception is a problem that arises during the execution of a program. It can occur for various reasons say,

* A user has entered an invalid data
* File not found
* A network connection has been lost in the middle of communications
* The JVM has run out of a memory


![alt text](https://miro.medium.com/max/700/1*H1w53c6-i93iXR6fipIr4A.png)

#### Exception Heirarchy

All exception and error types are subclasses of class Throwable, which is the base class of hierarchy. One branch is headed by Error which occurs at run-time and other by Exception that can happen either at compile time or run-time.


![alt text](https://miro.medium.com/max/700/1*IsYwm_RznOARWXPp-2rvUA.png)

an Error is used by the Java run-time system (JVM) to indicate errors that are associated with the run-time environment (JRE). StackOverflowError is an example of such an error. Whereas Exception is used for exceptional conditions that user programs should catch. NullPointerException is an example of such an exception.


![alt text](https://miro.medium.com/max/700/1*sz5qJCIROl1ClOFwhV2HNw.png)

##### Checked Exceptions

It is an exception that occurs at compile time, also called compile time exceptions. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword.

##### Checked Exceptions

It is an exception that occurs at the time of execution. These are also called Runtime Exceptions. In C++, all exceptions are unchecked, so it is not forced by the compiler to either handle or specify the exception. It is up to the programmers to specify or catch the exceptions.

    class Exception{
        public static void main(String args[]){
            try{

            //code that may raise exception

            }
            catch(Exception e){

            // rest of the program

            }
        }
    }

#### Types of Exceptions

##### Built in Exceptions


![alt text](https://miro.medium.com/max/700/1*GwJKMekkdoC69-rkIGfnXw.png)

##### User-Defined Exceptions

Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, a user can also create exceptions which are called ‘User-Defined Exceptions’.

* A user-defined exception must extend Exception class.
* The exception is thrown using throw keyword.

        class MyException extends Exception{ 

            String str1;

            MyException(String str2) 
            {
                str1=str2;
            }

            public String toString(){
                return ("MyException Occurred: "+str1);
            }
        }

        class Example1{
            public static void main(String args[]){
                try{
                    System.out.println("Start of try block");
                    throw new MyException(“Error Message");
                }
                catch(MyException exp){System.out.println("Catch Block");
                    System.out.println(exp);
                }
            }
        }

#### Exception Handling Methods

* try
* catch
* finally
* throw
* throws

##### try block

The try block contains a set of statements where an exception can occur. It is always followed by a catch block, which handles the exception that occurs in the associated try block. A try block must be followed by catch blocks or finally block or both.

    try
    {
        //code that may throw exception
    }
    catch(Exception_class_Name ref)
    {

    }

##### Nested try block

try block within a try block is known as nested try block in java.

    class Exception{
        public static void main(String args[]){
            try
            {
                try
                {
                    System.out.println("going to divide");
                    int b=59/0;
                }
                catch(ArithmeticException e)
                {
                    System.out.println(e);
                }
                
                try{
                    int a[]=new int[5];
                    a[5]=4;
                }
                catch(ArrayIndexOutOfBoundsException e) 
                {
                    System.out.println(e);
                }
                
                System.out.println("other statement);
                
                }
                catch(Exception e)
                {
                    System.out.println("Exception handeled");
                }

            System.out.println("casual flow");
        }
    }

##### catch block

A catch block is where you handle the exceptions. This block must follow the try block and a single try block can have several catch blocks associated with it. You can catch different exceptions in different catch blocks. When an exception occurs in a try block, the corresponding catch block that handles that particular exception executes.

    public class Testtrycatch1
    {
        public static void main(String args[])
        {
            int data=50/0; //may throw exception
            System.out.println("rest of the code...");
        }
    }

##### multi-catch block

If you have to perform various tasks at the occurrence of various exceptions, you can use the multi-catch block.

    public class SampleMultipleCatchBlock
    {
        public static void main(String args[])
        {
            try
            {
                int a[]=new int[5];
                a[5]=30/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println("task1 is completed");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("task 2 completed");
            }
            catch(Exception e)
            {
                System.out.println("task 3 completed");
            }

            System.out.println("remaining code");
        }
    }

##### finally block

A finally block contains all the crucial statements that must be executed whether an exception occurs or not. The statements present in this block will always execute, regardless an exception occurs in the try block or not such as closing a connection, stream etc.

    class SampleFinallyBlock
    {
        public static void main(String args[])
        {
            try
            {
                int data=55/5;
                System.out.println(data);
            }
            catch(NullPointerException e)
            {
                System.out.println(e);
            } 
            finally 
            {
                System.out.println("finally block is executed");
            }

            System.out.println("remaining code");

        }
    }

You might have heard that final, finally and finalize are keywords in Java. Yes, they are, but they differ from each other in various aspects.

##### final vs finally vs finalize

![alt text](https://miro.medium.com/max/700/1*yXdgqbQnDzGIX_5e5wd7BQ.png)

##### final vs finally vs finalize

![alt text](https://miro.medium.com/max/700/1*UGfrXiSkvGWVR1iJR_8DBg.png)

    //Java throw example
    void a()
    {
        throw new ArithmeticException("Incorrect");
    }

    //Java throws example
    void a()throws ArithmeticException
    {
        //method code
    }

    //Java throw and throws example
    void a()throws ArithmeticException
    {
        throw new ArithmeticException("Incorrect");
    }

### Nested Class

In Java, a class can be defined within another class and such classes are known as nested classes. These classes help you to logically group classes that are only used in one place. This increases the use of encapsulation and creates a more readable and maintainable code.

The class written within a class is called the nested class while the class that holds the inner class is called the outer class.

* The scope of a nested class is bounded by its enclosing class.
* A nested class has access to the members of the class in which it is nested. But, the enclosing class cannot access the members of the nested class.
* A nested class is its enclosing class member.
* A nested class can be declared public, private, protected, or package-private.

#### Types of nested classes

Inner/Non-static nested class: In Java, non-static classes are a security mechanism. A class cannot be associated with the access modifier private, but if you have the class as a member of other class, then the non-static class can be made private.

Types, 

* Inner Class
* Method-Local Inner Class
* Anonymouse Inner Class

##### Inner Class

To create an inner class you just need to write a class within a class. An inner class can be private which cannot be accessed from an object outside the class. Below is a program to create an inner class. In this example, the inner class is made private and is accessed class through a method.

    class Outer_Test {
        int num;
            
        // inner class
        private class Inner_Test {
            public void print() {
                System.out.println("This is an Our inner class");
            }
        }
            
        // Accessing he inner class from the method 
        void display_Inner() {
            Inner_Test inner = new Inner_Test();
            inner.print();
        }

    }
            
    public class My_class {
        
        public static void main(String args[]) {
            // Instantiating the outer class 
            Outer_Test outer = new Outer_Test();
            
            // Accessing the display_Inner() method.
            outer.display_Inner();
        }
    }


##### Method-local Inner Class

In Java, a class can be written within a method and it is a local type. Similar to local variables, the scope of an inner class is restricted within the method. A method-local inner class is incorporated only within the method where the inner class is defined. 

    public class Outerclass {
        // instance method of the outer class 
        void my_Method() {
            int num = 1001;
        
            // method-local inner class
            class StarInner_Test {
                public void print() {
                    System.out.println("This is star inner class "+num);       
                }   
            } // end of inner class
                
            // Accessing the inner class
            StarInner_Test star = new StarInner_Test();
            star.print();
        }
            
        public static void main(String args[]) {
            Outerclass outer = new Outerclass();
            outer.my_Method();           
        }
    }

##### Anonymous Inner Class

Anonymous inner class is an inner class declared without a class name. In an anonymous inner class, we declare and instantiate it at the same time. They are generally used when you need to override the method of a class or an interface.

    abstract class AnonymousInnerTest {
        public abstract void mytest();
    }
        
    public class Outer_class {
        
        public static void main(String args[]) {
            AnonymousInnerTest inner = new AnonymousInnerTest() {
                public void mytest() {
                    System.out.println("This is an example of anonymous inner test class");
                }
            };

            inner.mytest();   
        }
    }


##### Static Nested Class

A static class is a nested class that is a static member of the outer class. Unlike inner class, the static nested class cannot access member variables of the outer class because the static nested class doesn’t require an instance of the outer class. Hence, there is no reference to the outer class with OuterClass.this.

    public class Outer {
        static class Nested_Test {
            public void my_method() {
                System.out.println("This is Edureka's nested test class");
            }
        }
            
        public static void main(String args[]) {
            Outer.Nested_Test nested = new Outer.Nested_Test();    
            nested.my_method();
        }
    }


##### Difference Between Static and Non-static Nested Classes

Static nested classes do not have access to other members of the enclosing class directly. Being static, it must access the non-static members of its enclosing class through an object which means it cannot refer to the non-static members of its enclosing class directly. And due to this restriction, static nested classes are seldom used.

Non-static nested classes have access to all members of its outer class and can refer to them directly in the same way that other non-static members of the outer class do.

#### Notes

The inner class is treated as a regular member of a class.

Since the inner class is members of the outer class, you can apply different access modifiers like protected, private to your inner class.

Since the Nested class is a member of its enclosing class, you can use . (dot) notation in order to access the nested class and its members.

Using a nested class makes your code more readable and provides better encapsulation.

The inner class has access to other members of the outer class, even if they are declared private.