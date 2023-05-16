package ForEach;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        /*For-each(Enhanced for loop) - traversing technique to iterate through the elements in an array/collection
        *                               less steps, more readable,
        *                               less flexible.*/

        //String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("rat");
        animals.add("dog");
        animals.add("bird");

        for(String animal : animals) {
            System.out.println(animal);
        }
    }
}
