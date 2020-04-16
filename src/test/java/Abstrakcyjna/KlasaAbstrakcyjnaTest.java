package Abstrakcyjna;

import org.testng.annotations.Test;

public class KlasaAbstrakcyjnaTest {

    @Test
    public void testKlasyAbstrakcyjnej() {
        Pies reksio = new Pies();
        reksio.poruszajSie();
        reksio.wypiszPrzysmak();
        reksio.napijSieWody();
        System.out.println(reksio.gatunek);

        Ptak tweety = new Ptak();
        tweety.napijSieWody();
        tweety.poruszajSie();
        tweety.wypiszPrzysmak();
        tweety.gatunek="Ptak";
        System.out.println(tweety.gatunek);

    }
}
