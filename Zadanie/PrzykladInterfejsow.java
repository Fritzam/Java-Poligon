package Zadanie;

public class PrzykladInterfejsow {

    public static void main(String[] args) {
        SamochodElektryczny tesla = new SamochodElektryczny("Tesla", "Model S", 100);
        System.out.println("Marka: " + tesla.getMarka());
        System.out.println("Model: " + tesla.getModel());
        tesla.wyswietlPozostalyZasieg();
        tesla.jedz();
        tesla.wyswietlPozostalyZasieg();
        tesla.ladujBaterie();
        tesla.wyswietlPozostalyZasieg();
    }
}

interface Pojazd {
    void jedz();

    default void wyswietlPozostalyZasieg() {
        System.out.println("Pozostaly zasieg: informacja niedostępna.");
    }
}

interface Samochod extends Pojazd {
    String getMarka();
    String getModel();
}
interface Elektryczny extends Samochod {
    void ladujBaterie();
    int getPozostaloBaterii();
    @Override
    default void wyswietlPozostalyZasieg() {
        System.out.println("Pozostały zasięg: około " + getPozostaloBaterii() + " km");
    }
}



class SamochodElektryczny implements Elektryczny {

// TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!

    String marka;
    String model;
    int pozostalyZasieg;
    SamochodElektryczny(String marka, String model, int pozostalyZasieg) {
        this.marka = marka;
        this.model = model;
        this.pozostalyZasieg = pozostalyZasieg;
    }

    @Override
    public void ladujBaterie() {
        this.pozostalyZasieg = 100;
    }

    @Override
    public int getPozostaloBaterii() {
        return pozostalyZasieg;
    }

    @Override
    public String getMarka() {
        return this.marka;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public void jedz() {
        this.pozostalyZasieg--;
    }
}
