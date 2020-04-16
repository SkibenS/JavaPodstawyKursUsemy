package interfejsy;

public class PremiumAuto  implements Auto {

    private String model = "F20";
    private String marka = "BMW";

    public void toJestMetodaSpecyficznaPremium() {
        System.out.println("Jedziesz autem typu premium " + marka + " " + model);

    }
    @Override
    public void jedz() {
        System.out.println("Jedziesz samochodem marki premium");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Używasz hamulców tarczowych wysokiej klasy");
    }

    @Override
    public void otworzSzybę() {
        System.out.println("Automatyczne szyby opuszczane");
    }

    @Override
    public void zmienBieg() {
        System.out.println("Automatyczna skrzynia biegów to jest to");
    }
}
