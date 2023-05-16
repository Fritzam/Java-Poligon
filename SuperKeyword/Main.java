package SuperKeyword;

public class Main {
    public static void main(String[] args) {

        /*super - Keyword refers to the superclass (parent) of an object.
                  very similar to "this" keyword.*/

        Hero hero1 = new Hero("Batman", 42, "MONEYZ$$$");
        Hero hero2 = new Hero("Superman", 43, "EVERYTHING");
       /* Hero[] heroes = {hero1, hero2};

        for (Hero hero: heroes) {
            System.out.println("Name: " + hero.name + "\nAge: " + hero.age + "\nPower: " + hero.power);
            System.out.println("------------------------------------------------------");
        }*/

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());


    }
}
