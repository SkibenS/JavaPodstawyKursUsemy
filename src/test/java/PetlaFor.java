import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaFor {

    // wypiszmy w konsoli liczby od 0 do 10

    @Test
    public void wypiszLiczby() {

        for (int i=0; i<10; i++){
            System.out.println(i);
        }

        List<String> studenci = Arrays.asList("Tomek", "Maciek", "Andrzej", "Kacper", "Marysia");
        for (String sth: studenci) {
            System.out.println(sth);
        }

        for (int index = 0; index < studenci.size(); index = index+1){
            System.out.println("Student numer: " + index + " to " +studenci.get(index));
        }
    }
}
