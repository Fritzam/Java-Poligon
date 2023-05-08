public class Car3 {

    String make = "Lexus";
    String model = "IS300h";
    int year = 2023;
    String color = "Black";
    double price = 50000.00;

    void drive() {
        System.out.println("You drive the car.");
    }
    void brake() {
        System.out.println("You step on the brakes.");
    }

    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }

}
