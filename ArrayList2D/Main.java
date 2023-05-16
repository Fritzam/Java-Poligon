package ArrayList2D;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        /*2D ArrayList = A dynamic list of lists
        *                You can change the size of these lists during runtime.*/
        ArrayList<String> bakeryList = new ArrayList<String>();
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic bread");
        bakeryList.add("Donuts");

        //Remember, to access at an index use .get(index); !
        //System.out.println(bakeryList);

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Soda");
        drinksList.add("Coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(1));

    }
}
