import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TrianguloIsosTest {

    @Test
    void testDesenhar() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));
        TrianguloIsos trianguloIsos = new TrianguloIsos();
        trianguloIsos.desenhar();
        assertEquals("Triangulo Isósceles\r\n", saidaCapturada.toString());
        System.setOut(System.out);
    }
}
