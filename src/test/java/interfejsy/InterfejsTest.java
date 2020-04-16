package interfejsy;

import org.testng.annotations.Test;

public class InterfejsTest {

    @Test
    public void interfejsTest() {
        Auto premiumAuto = new PremiumAuto();
        zaprezentujAuto(premiumAuto);

        Auto podstawowaAuto = new PodstawowaAuto();
        zaprezentujAuto(podstawowaAuto);
    }

    public void zaprezentujAuto (Auto auto) {
        auto.jedz();
        auto.zatrzymaj();
        auto.otworzSzybę();
        auto.zmienBieg();
    }
}
