package Generics;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        /* generics - Enable types(classes and interfaces) to be parameters when defining:
                      classes, interfaces and methods.
                      A benefit is to eliminate the need to create multiple versions
                      of methods or classes for various data types.
                      Use 1 version for all reference data types. */
        /*MyIntegerClass myInt = new MyIntegerClass(2);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('Q');
        MyStringClass myString = new MyStringClass("Papier");
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());*/

        MyGenericClass <Integer, Integer> myInt = new MyGenericClass<>(12, 9);
        MyGenericClass <Double, Double> myDouble = new MyGenericClass<>(3.14, 2.70);
        //Bounded types - you can create the objects of a generic class to have data
        // of specific derived types ex.Number.
        /*MyGenericClass <Character, Character> myChar = new MyGenericClass<>('Q', 'Q');
        MyGenericClass <String, Character> myString = new MyGenericClass<>("Papier", 'Q');*/


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        /*System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
*/



    }
}