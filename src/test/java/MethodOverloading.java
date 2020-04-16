import org.testng.annotations.Test;

public class MethodOverloading {

    @Test
    public void methodOverloadingTest() {
        Select autoselect = new Select();

        autoselect.selectBy(1);
        autoselect.selecyBy("Volvo");

    }
}
