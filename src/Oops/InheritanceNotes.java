package Oops;
/*  Inheritance -
    - Inheritance is one of the four pillars of Object-Oriented Programming (OOP).
    - it allows one class to acquire properties and behaviors of another class
    - This promotes code reusability and establishes a parent-child relationship between classes.
    - Mechanism of reusing code from one class into another.
    - The extends keyword is used in Java to implement inheritance.
    - A child class can use methods and variables of the parent class.
    - if you use Private method another child class cant extends its own parent

    Why do we need inheritance
    - without inheritance
        - you repeat the same code again and again
        - code becomes longer and harder to maintain
    - with inheritance
        - you write common code once
        - other classes reuse it
        - code becomes clean and structure

    Types of Inheritance
    1-Single Inheritance
        - one child class inherits from one parent class
        - Parent cannot access child method
        - ex
            class A { }
            class B extends A { }
    2-Multilevel Inheritance
        - A class inherits from another class, which itself inherits from another class.
        - ex
            class A { }
            class B extends A { }
            class C extends B { }
    3-Hierarchical Inheritance
        - Multiplr child classes inherit from one single parent class
        - so one parent many chlidren
        - ex
            class Parent { }
            class Child1 extends Parent { }
            class Child2 extends Parent { }
            class Child3 extends Parent { }
                Parent
               /   |   \
           Child1 Child2 Child3
    4-Hybrid Inheritance
        - it combines two or more type of inheritance in one program
        - Hybrid Inheritance is a combination of:Single Inheritance, Multilevel Inheritance, Hierarchical Inheritance
        - ex
            A
           / \           Here: B and C inherit from A (Hierarchical)
          B   C                D inherits from C (Multilevel)
               \
                D

    ❌ Important: Hybrid Inheritance with Classes is NOT Fully Supported in Java
        - class A {}
        - class B {}
        - class C extends A, B {}  ❌
        - Because of the Diamond Problem
        - But Java supports Hybrid Inheritance using Interfaces

    🔷 What is the Diamond Problem?
          A
         / \
        B   C
         \ /
          D
        - If:
            B and C inherit from A
            D inherits from B and C
            Now if A has a method show(),
            Which version should D use?
            👉 Confusion occurs. This is called the Diamond Problem.
            That’s why Java does not allow multiple inheritance with classes.

    🔷 Object Class in Inheritance (Java)
        - Every class directly or indirectly inherits from the Object class.
        - The Object class is the root (topmost parent) of all classes in Java.
        - It is present inside the package:java.lang.Object
        - Even if you write:
                                -class Animal {}
                                -Java automatically treats it as:
                                    -class Animal extends Object {}
                                -so internally
                                    -Object
                                       ↑
                                     Animal
*/

// Single Level Inheritance
class Animal {
     void eat() {  // You can not use Private method here
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal { // Single level inheritance
    void bark() {
        System.out.println("Dogs barks");
    }
}

//Multi-Leval Inheritance
class LivingThings{
    void breathe(){
        System.out.println("Living Things can breathes");
    }
}

class Human extends LivingThings{
    void walk(){
        System.out.println("Human walks");
    }
}

class Employee extends Human{
    void work(){
        System.out.println("Employee works in office");
    }
}

//hierarchical Inheritance
class Appliance {
    void swithchON(){
        System.out.println("Appliance is turn on");
    }
}

class Fan extends Appliance {
    void rotata() {
        System.out.println("Fan is Rotating");
    }
}

class Light extends Appliance {
    void glow() {
        System.out.println("Light is glowing");
    }
}


public class InheritanceNotes {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.swithchON();
        f.rotata();

        Light l = new Light();
        l.swithchON();
        l.glow();
    }
}
