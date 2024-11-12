import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class QuadradoTest {

    @Test
    void testDesenhar() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));


        Quadrado quadrado = new Quadrado();
        quadrado.desenhar();

        assertEquals("Quadrado\r\n", saidaCapturada.toString());

        System.setOut(System.out);
    }
}
