import org.testng.annotations.Test;

public class OperatoryLogicznePorownawcze {

    @Test
    public void testOperatorów() {

        int liczbaA = 2;
        int liczbaB = 5;

        System.out.println(liczbaA > liczbaB);      // falce
        System.out.println(liczbaA  <liczbaB);      // true
        System.out.println(liczbaA == liczbaB);     // false
        System.out.println(liczbaA != liczbaB);     // true
        System.out.println(liczbaA >= liczbaB);     // false
        System.out.println(liczbaA <= liczbaB);     // true

        System.out.println(1>0 && 1>=1);    // true
        System.out.println(1>2 || 0>2);     // false
        System.out.println(2>3 && 3>2);     // false
        System.out.println(1>0 || 3>5);     // true

    }
}
