package CopyObjects;

class Car {

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        setMake(make);
        setModel(model);
        setYear(year);
    }

    Car(Car car) {
        this.copy(car);
    }

    void setMake(String make) {
        this.make = make;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setYear(int year) {
        this.year = year;
    }

    String getMake() {
        return this.make;
    }

    String getModel() {
        return this.model;
    }

    int getYear() {
        return this.year;
    }

    private String divider() {
        return "\n-------------------------------------------------";
    }
    @Override
    public String toString() {
        return "Make: " + getMake() + "\nModel: " + getModel() + "\nYear: " + getYear() + divider();
    }

    void copy(Car car) {
        this.setMake(car.getMake());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }
}
