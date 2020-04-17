package Kolekcje;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Mapy {

    Map<Integer, String> dziennik = new HashMap<Integer, String>();

    public void dodajuczniow(){
        dziennik.put(1,"Kowalska");
        dziennik.put(2,"Nowak");
        dziennik.put(3,"Boniek");
        dziennik.put(4,"Majewska");
    }

    @Test
    public void testMap(){
        dodajuczniow();
        dziennik.size();
        System.out.println(dziennik.size());
        dziennik.remove(1);
        System.out.println(dziennik.size());
        System.out.println(dziennik.get(3));
        System.out.println(dziennik.containsKey(3));
        dziennik.put(2, "Nowy Nowak");
        System.out.println(dziennik.get(2));
    }

}
