package SuperKeyword;

class Hero extends Person{
    String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() +"\n" + "Power: " + this.power + "\n" + divider();
    }

}
