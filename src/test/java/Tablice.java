public class Tablice {

    int liczby[] = new int[5];

    Student studenci[] = new Student[2];

    public void dodajStudenta(){
        Student pierwszy = new Student("Tomasz", "Kot", "1");
        Student drugi = new Student("Maja", "Kowalska", "2");

        studenci[0] = pierwszy;
        studenci[1] = drugi;
    }

    public void przedstawStudenta() {
        try {studenci[0].przedstawSie();
            studenci[1].przedstawSie();
           // studenci[2].przedstawSie();
            System.out.println("Tutaj znajduje się coś innego");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Wystąpił wyjątek ! Odwołujesz się do elementu tablicy którego nie ma");
        } finally {
            System.out.println("Zamykam połaczenie do bazy danych");
        }
    }
}
