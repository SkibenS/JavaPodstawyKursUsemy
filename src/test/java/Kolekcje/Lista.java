package Kolekcje;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    List<String> imiona = new ArrayList<String>();

    List<Integer> numery = new ArrayList<Integer>();

    public void dodajImiona(){
        imiona.add("Tomek");
        imiona.add("Paweł");
        imiona.add("Maciek");
    }

    public void ustawnNumeryLotto(){
        numery.add((2));
        numery.add((11));
        numery.add((29));
        numery.add((33));
        numery.add((1));
        numery.add((45));

    }
    @Test
    public void testList(){
        dodajImiona();
        System.out.println(imiona.get(0));
        System.out.println(imiona.get(1));
        System.out.println(imiona.get(2));
        System.out.println(imiona.size());
        imiona.remove("Tomek");
        System.out.println(imiona.size());
        System.out.println(imiona.contains("Maciek"));
    }

    @Test
    public void testNumerow(){
        ustawnNumeryLotto();
        System.out.println(numery.get(0));
        System.out.println(numery.contains(2));
        System.out.println(numery.size());
        System.out.println(numery.remove(2));
        System.out.println(numery.size());
    }
}
