import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaDoWhile {

    @Test
    public void testPetliDoWhile() {

        int index = 0;

        List<String> rzeczy = Arrays.asList("Lampa", "Stolik", "Sofa");

        do {
            System.out.println(rzeczy.get(index));
            index++;
        }while (index<rzeczy.size());

    }
}
