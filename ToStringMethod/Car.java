package ToStringMethod;

class Car {
    String make = "Lexus";
    String model = "IS300h";
    String color = "Black";
    int year = 2021;

    public String toString() {
        String myString = "Make: " + make + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year;
        return myString;
    }

}
