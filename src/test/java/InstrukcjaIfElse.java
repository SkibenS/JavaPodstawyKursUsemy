import org.testng.annotations.Test;

public class InstrukcjaIfElse {

    // instruckja warinkowa

    @Test
    public void testInstrukcji() {
        sprawdzWiek(17);
        sprawdzWiek(20);
    }

    public void sprawdzWiek(int wiek) {

        if (wiek < 18){
            System.out.println("Alkoholu poniżej 18 lat nie sprzedajemy");
        } else {
            System.out.println("Możesz kupić alkohol");
        }
    }

}
