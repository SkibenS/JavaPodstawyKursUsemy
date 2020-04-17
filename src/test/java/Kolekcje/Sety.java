package Kolekcje;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Sety {

    Set<String> nicks = new HashSet<>();

    public void dodajNickiUzytkownikow() {
        nicks.add("Killer leszczy");
        nicks.add("Noob");
        nicks.add("Czarna Owca");
        nicks.add("Swinka Peppa");
    }

    @Test
    public void testSetow(){
        dodajNickiUzytkownikow();
        nicks.add("Master");
        System.out.println(nicks.size());
        System.out.println(nicks.contains("Killer leszczy"));
        nicks.remove("Swinka Peppa");
        System.out.println(nicks.size());
    }
}
