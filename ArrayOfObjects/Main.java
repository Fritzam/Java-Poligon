package ArrayOfObjects;

class Main {
    public static void main(String[] args) {

        //

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hot-dog");

        Food[] refrigerator = {food1, food2, food3};
        /*refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;*/

        for(int i = 0; i < refrigerator.length; i++) {
            System.out.println(refrigerator[i].name);
        }


    }
}
