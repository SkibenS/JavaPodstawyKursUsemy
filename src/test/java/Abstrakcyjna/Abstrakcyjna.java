package Abstrakcyjna;

abstract class zwierzatko {

    public String gatunek = "Ssak";

    public abstract void poruszajSie();

    public abstract void wypiszPrzysmak();

    public void napijSieWody(){
        System.out.println("Piję Wodę");
    }
}
