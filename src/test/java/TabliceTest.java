import org.testng.annotations.Test;

public class TabliceTest {

    @Test
    public void testTablic(){

        Tablice tablice = new Tablice();
        tablice.dodajStudenta();
        tablice.przedstawStudenta();
    }
}
