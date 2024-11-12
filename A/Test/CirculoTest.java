import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class CirculoTest {

    @Test
    void testDesenhar() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        Circulo circulo = new Circulo();
        circulo.desenhar();
        assertEquals("Círculo\r\n", saidaCapturada.toString());

        System.setOut(System.out);
    }
}
