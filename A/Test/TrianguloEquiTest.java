import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TrianguloEquiTest {

    @Test
    void testDesenhar() {
        // Configura um OutputStream para capturar a saída do System.out
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        // Cria uma instância de TrianguloEqui e chama o método desenhar
        TrianguloEqui trianguloEqui = new TrianguloEqui();
        trianguloEqui.desenhar();

        // Verifica se a saída é a esperada
        assertEquals("Triangulo Equilátero\r\n", saidaCapturada.toString());

        // Restaura o System.out para o console padrão
        System.setOut(System.out);
    }
}
