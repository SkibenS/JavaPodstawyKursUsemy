import org.testng.annotations.Test;

public class ParanetryMetod {

    public int suma(int pierwszeLiczba, int drugaLiczba){
        // suma = pierwsza liczba + druga liczba
        return pierwszeLiczba + drugaLiczba;
    }

    public void przywitajSię(String imie){
        System.out.println("Witaj " + imie);
    }

    @Test
    public void testParametrow(){
        int sumaLiczb = suma(1,2);
        System.out.println(sumaLiczb);
        System.out.println(suma(2,5));
        przywitajSię("Kasia");
        przywitajSię("Bartek");
    }

}
