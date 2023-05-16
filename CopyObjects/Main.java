package CopyObjects;

class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lexus", "IS300h", 2021);
        //Car car2 = new Car("Mazda", "6", 2021);

        System.out.println(car1.toString());
        //System.out.println(car2.toString());

        //car2.copy(car1);
        //System.out.println(car2.toString());

        Car car2 = new Car(car1);
        System.out.println(car2.toString());



    }
}
