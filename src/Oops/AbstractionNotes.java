package Oops;
/*
    Abstraction
    -abstraction means hiding internal implementation details and showing only essential functionality to user.
    -Abstraction focuses on what an object does, not how it does it.
    -It hides the internal implementation and exposes only the necessary functionality.

    -Abstract class can have constructor
    -Interface cannot have constructor
    -Abstract class → extends
    -Interface → implements
    -Cannot create object of abstract class directly

    How to Achieve Abstraction in Java?
    -Abstraction in Java can be achieved in two ways:
    -1-Abstract Classes (0%–100% abstraction)
    -2-Interfaces (100% abstraction before Java 8, but Java 8+ allows default and static methods)

    Abstract Classes(ex-37)
    -A class declared with the abstract keyword.
    -Can have abstract methods (without body) and concrete(normal) methods (with body).
    -Cannot be instantiated (no objects can be created directly).
    -Can have constructors (used for initializing variables when subclass objects are created).

    Interfaces in Java(ex-56)
    -An interface is a collection of abstract methods.
    -Provides 100% abstraction (before Java 8).
    -Used to achieve multiple inheritance in java.
    -it supports multiple inheritance.


    important(ex-73)
    -here diamond problem is formed or not
    -not formed because in interface a method have not any body and we create body in our child class child class is only one which can handle multiplr inheritance
*/

//Abstract Class Example
abstract class Alian{
    abstract void sound();

    void notEat() {
        System.out.println("This alians cannot eat.");
    }

    Alian() {
        System.out.println("Animal Constructor called.");
    }
}

class Man extends Alian{
    void sound(){
        System.out.println("okok");
    }
}

//Interface Example
interface Payment{
    void pay(double amount);
}

class upiPayemt implements Payment{
    public void pay(double amount){
        System.out.println("Amount of "+ amount +" paid using UPI.");
    }
}

class creditCard implements  Payment{
    public void pay(double amount){
        System.out.println("Amount of "+ amount +" paid using Credit Card.");
    }
}

//Diamond Problem is not formed
interface Print {
    void print();
    void play();
}

interface Scan {
    void scan();
    void play();
}

class Matchine implements Print, Scan {
    public void print(){
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }

    public void play() {
        System.out.println("Playing...");
    }
}
public class AbstractionNotes {
    public static void main(String[] args){
        System.out.println("Abstarct Class");
        Alian a = new Man();
        a.sound();
        a.notEat();

        System.out.println("Interface");
        Payment p1 = new upiPayemt();
        Payment p2 = new creditCard();
        p1.pay(500);
        p2.pay(1000);

        System.out.println("Diamond Problem Not Found Here");
        Matchine m = new Matchine();
        m.play();
        m.print();
        m.scan();
    }
}
