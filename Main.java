import Interfaces.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my training grounds!");
        System.out.println("---------------------------------");

        //Delete only below this line.

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();

    }
}
