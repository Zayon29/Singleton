import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class QuadradoTest {

    @Test
    void testDesenhar() {
        // Configura um OutputStream para capturar a saída do System.out
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        // Cria uma instância de Quadrado e chama o método desenhar
        Quadrado quadrado = new Quadrado();
        quadrado.desenhar();

        // Verifica se a saída é a esperada
        assertEquals("Quadrado\r\n", saidaCapturada.toString());

        // Restaura o System.out para o console padrão
        System.setOut(System.out);
    }
}
