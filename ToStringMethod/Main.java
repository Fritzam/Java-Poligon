package ToStringMethod;

class Main {
    public static void main(String[] args){
        /*toString() - special method that all objects inherit,
                       that returns a string that "textually represents" an object.
                       Can be used both implicitly and explicitly.*/

        Car car = new Car();

        /*System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);
        System.out.println(car.make);*/

        System.out.println(car);


    }
}
