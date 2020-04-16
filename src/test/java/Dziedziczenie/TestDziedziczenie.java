package Dziedziczenie;

import org.testng.annotations.Test;

public class TestDziedziczenie {

    @Test
    public void testDziedziczenia() {
        Dziecko dziecko = new Dziecko();
        dziecko.probujePływać();
    }
}
