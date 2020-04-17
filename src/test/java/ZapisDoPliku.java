import org.testng.annotations.Test;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;


public class ZapisDoPliku {

    @Test
    public void zapisDoPliku() throws IOException {

        File file = new File("src/main/resources/zapis.txt");

        BufferedWriter writer = Files.newBufferedWriter(file.toPath(), Charset.defaultCharset());
        writer.write("To zapisujemy do pliku");
        writer.close();
    }
}
