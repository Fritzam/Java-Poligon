package MethodOverriding;

class Main {
    public static void main(String[] args) {
        /* Method overriding - Declaring a method in a subclass,
                               which is already present in parent class.
                               Doing so gives child its own implementation of a method. */
        Animal animal = new Animal();
        animal.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
