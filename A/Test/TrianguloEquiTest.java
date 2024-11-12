import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TrianguloEquiTest {

    @Test
    void testDesenhar() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));


        TrianguloEqui trianguloEqui = new TrianguloEqui();
        trianguloEqui.desenhar();

        assertEquals("Triangulo Equilátero\r\n", saidaCapturada.toString());

        System.setOut(System.out);
    }
}
