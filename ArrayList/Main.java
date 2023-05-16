package ArrayList;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        /*ArrayList - A resizable array.
        *             Elements can be added and removed after compilation phase.
        *             It stores reference datatype, use Wrapper for primitives.*/

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hot-dog");

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        System.out.println("-----------------------------");

        //Replaces value at an index with the secondary argument.
        food.set(0, "Sushi");

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        System.out.println("-----------------------------");

        //Removes value at an index.
        food.remove(2);

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        System.out.println("-----------------------------");

        //Removes all elements of an array.
        food.clear();

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        System.out.println("-----------------------------");

    }
}
