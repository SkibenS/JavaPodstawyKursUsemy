package Dziedziczenie;

public class Dziecko extends Rodzic {

    protected String kolorOczu = "zielone";

    public void wypiszMojKolorOczu() {
        System.out.println("Mój kolor oczu to " + kolorOczu);
    }

    public void wypiszMojKolorWlosow() {
        System.out.println("Mój kolor włosów to " +kolorWlosow);
    }

    public void wypiszTypCeryOrazSklonnosciDoTycia() {
        System.out.println("Mój typ cery to: " + typCery + " oraz mam skłonności do Tycia " + sklonnoscDoTycia);
    }

    public void probujePływać() {
        System.out.println("Nie umiem pływać, jestem za mały");
    }
}
