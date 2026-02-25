package Oops;

class Vehicle {
    String model;

    private int speed;

    //Without Parameter = Default Constructor
    Vehicle() {
        model = "SUV";
        speed = 40;
    }

    //Parametrized constructor
    Vehicle(String model, int speed){
        this();
        System.out.println("befor updating" + this.model);
        this.model = model;
        this.speed = speed;
        System.out.println("after updating" + this.model);
    }

    //Copy constructor
    Vehicle(Vehicle that){
        this.speed = that.speed;
        this.model = that.model;
    }

    void accelerate(int delta){
        speed += delta;
    }

    int getSpeed() {
        return speed;
    }

}

public class Constructor {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println("Default Constructor " + v.getSpeed());

        Vehicle v1 = new Vehicle("FORD", 30);
        System.out.println("Parameterized Constrctor " + v1.getSpeed());

        Vehicle v2 = new Vehicle(v);
        System.out.println("Copy Constructor " + v2.getSpeed());
    }
}
