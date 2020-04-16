public class Tablice {

    int liczby[] = new int[5];

    public void ustawWastosc() {
        liczby[0] = 1;
        liczby[1] = 10;
        liczby[2] = 25;
        liczby[3] = 100;
        liczby[4] = 150;
    }

    public void wypiszElementy() {
        for (int i=0; i<liczby.length; i++);
            System.out.println(liczby[i]);
    }
}
