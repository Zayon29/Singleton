import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TrianguloRetaTest {

    @Test
    void testDesenhar() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo();
        trianguloRetangulo.desenhar();
        assertEquals("Triangulo Retangulo\r\n", saidaCapturada.toString());
        System.setOut(System.out);
    }
}

