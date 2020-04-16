package Abstrakcyjna;

public class Pies extends zwierzatko {


    @Override
    public void poruszajSie() {
        System.out.println("Biegam na czterech łapkach");
    }

    @Override
    public void wypiszPrzysmak() {
        System.out.println("Lubię kości");
    }
}
