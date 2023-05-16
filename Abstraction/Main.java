package Abstraction;

class Main {
    public static void main(String[] args) {
        /* Abstract - Abstract classes cannot be instantiated, but they can have a subclass
                      abstract methods are declared without an implementation.
                      A security layer, it prevents class or method from being instantiated,
                      and forces children of abstract class to implement everything in the super class with overriding.
        */

        //Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.go();
    }
}
