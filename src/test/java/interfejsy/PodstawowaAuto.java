package interfejsy;

public class PodstawowaAuto implements Auto {

    private String model = "Tipo";
    private String marka = "Fiat";

    public void toJestMetodaSpecyficzna() {
        System.out.println("To jest metoda dla posiadacza auta wersji podstawowej " + model + " " + marka);
    }

    @Override
    public void jedz() {
        System.out.println("Jedziesz podstawowaym modelem auta");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymujesz auto używająć hamulców bembnowych");
    }

    @Override
    public void otworzSzybę() {
        System.out.println("Kręcisz korbą aby otworzyć szybę");
    }

    @Override
    public void zmienBieg() {
        System.out.println("Zmieniasz bieg manualną skrzyną biegów");
    }
}
