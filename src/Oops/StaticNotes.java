package Oops;
/*
    Static Keyword -
        -Used for memory management and to create members that belong to the class rather than any specifc object
        -Belong to the class, Not to the Object.

    1-Static Variables -
        -A static variable is shared among all objects of the class,
        -it belongs to the class, not to individual object
        -it created only once in the memory.
        -commanly used for constants and counters.
        -We should access static variables using Class Name, not object.
        -ex
            class Student{
                int rollNo;
                String name;
                static String clg = "Trimurti"; //static variable

                Student(int r, String n){
                    rollNo = r;
                    name = n;
                }

                void display(){
                    System.out.println(rollNo + " " + name + " " + clg);
                    System.out.println();
                }
            }

            public class StaticNotes {
                public static void main(String[] args) {
                    Student s1 = new Student(30, "Dhiraj");
                    Student s2 = new Student(21, "Jay");
                    s1.display();
                    s2.display();
                }
            }

    2-Static Method -
        -A Static Method belongs to the class rather an object

        -it can be called without creating an object of the class.
            -ex
                class Student{
                    static int cube(int x){
                        return x * x * x;
                    }
                }

                public class StaticNotes {
                    public static void main(String[] args) {
                        System.out.println(Student.cube(10));
                    }
                }

        -it can only access static data and static methods directly.
            -ex
                static int a = 10;

                static void show() {
                    System.out.println(a);
                }

        -Cannot use this or super inside static methods.

        -static method can call another static method directly.
            -ex
                static void A() {
                    System.out.println("A");
                }

                static void B() {
                    A(); // allowed
                }

        -To access non-static inside static → create object
            -ex
                class Test {

                    int x = 10;

                    static void show() {
                        Test t = new Test();
                        System.out.println(t.x);
                    }
                }

    3-Static block
        -a static block is used to initialize static data members.

        -it runs only once

        -Cannot access non-static members directly
            -ex
                int x = 10;

                static {
                    System.out.println(x); // ERROR
                }

        -Can access only static members
            ex-
                static int x = 10;

                static {
                    System.out.println(x); // OK
                }

        -execution in order
            1) Static Block
            2) main() method
            3) Object creation
            4) Constructor
            ex-
                class Demo {

                    static {
                        System.out.println("1. Static Block");
                    }

                    Demo() {
                        System.out.println("3. Constructor");
                    }

                    public static void main(String[] args) {
                        System.out.println("2. Main Method");
                        Demo d = new Demo();
                    }
                }
                output - 1. Static Block
                         2. Main Method
                         3. Constructor

 */
class Student{

}

public class StaticNotes {
    public static void main(String[] args) {

    }
}
