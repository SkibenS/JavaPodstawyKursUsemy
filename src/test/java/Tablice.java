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
        studenci[0].przedstawSie();
        studenci[1].przedstawSie();

    }
}
