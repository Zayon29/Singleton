import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TrianguloRetaTest {

    @Test
    void testDesenhar() {
        // Configura um OutputStream para capturar a saída do System.out
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        // Cria uma instância de TrianguloRetangulo e chama o método desenhar
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo();
        trianguloRetangulo.desenhar();

        // Verifica se a saída é a esperada
        assertEquals("Triangulo Retangulo\r\n", saidaCapturada.toString());

        // Restaura o System.out para o console padrão
        System.setOut(System.out);
    }
}

