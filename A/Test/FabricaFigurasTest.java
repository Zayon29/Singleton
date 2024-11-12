import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class FabricaFigurasTest {

    private static FabricaFiguras fabrica;

    @BeforeAll
    static void setup() {
        // Inicializa a fábrica
        fabrica = FabricaFiguras.getInstancia();
    }

    @Test
    void testSingleton() {
        // Verifica se FabricaFiguras é Singleton
        FabricaFiguras outraInstancia = FabricaFiguras.getInstancia();
        assertSame(fabrica, outraInstancia, "FabricaFiguras não está seguindo o padrão Singleton");
    }

    @Test
    void testCriarCirculoUnico() {
        // Teste de criação de um único círculo
        Figura circulo1 = fabrica.criarCirculo();
        Figura circulo2 = fabrica.criarCirculo();
        assertSame(circulo1, circulo2, "criarCirculo não está retornando a mesma instância");
    }

    @Test
    void testCriarTrianguloIsoscelesUnico() {
        // Teste de criação de um único triângulo isósceles
        Figura trianguloIsos1 = fabrica.criarTrianguloIsosceles();
        Figura trianguloIsos2 = fabrica.criarTrianguloIsosceles();
        assertSame(trianguloIsos1, trianguloIsos2, "criarTrianguloIsosceles não está retornando a mesma instância");
    }

    @Test
    void testCriarTrianguloEquilateroUnico() {
        // Teste de criação de um único triângulo equilátero
        Figura trianguloEqui1 = fabrica.criarTrianguloEquilatero();
        Figura trianguloEqui2 = fabrica.criarTrianguloEquilatero();
        assertSame(trianguloEqui1, trianguloEqui2, "criarTrianguloEquilatero não está retornando a mesma instância");
    }

    @Test
    void testCriarTrianguloRetanguloUnico() {
        // Teste de criação de um único triângulo retângulo
        Figura trianguloRet1 = fabrica.criarTrianguloRetangulo();
        Figura trianguloRet2 = fabrica.criarTrianguloRetangulo();
        assertSame(trianguloRet1, trianguloRet2, "criarTrianguloRetangulo não está retornando a mesma instância");
    }

    @Test
    void testCriarQuadradoIlimitado() {
        // Teste de criação de quadrados (devem ser instâncias diferentes)
        Figura quadrado1 = fabrica.criarQuadrado();
        Figura quadrado2 = fabrica.criarQuadrado();
        assertNotSame(quadrado1, quadrado2, "criarQuadrado deve retornar uma nova instância a cada chamada");
    }

    @Test
    void testDesenhar() {
        // Configura o OutputStream para capturar o System.out
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        // Chama o método desenhar de cada figura
        fabrica.criarCirculo().desenhar();
        fabrica.criarTrianguloIsosceles().desenhar();
        fabrica.criarTrianguloEquilatero().desenhar();
        fabrica.criarTrianguloRetangulo().desenhar();
        fabrica.criarQuadrado().desenhar();

        // Verifica a saída capturada
        String saidaEsperada = "Círculo\r\n" +
                "Triangulo Isósceles\r\n" +
                "Triangulo Equilátero\r\n" +
                "Triangulo Retangulo\r\n" +
                "Quadrado\r\n";
        assertEquals(saidaEsperada, saidaCapturada.toString(), "A saída do método desenhar não está correta");

        // Restaura o System.out para o console padrão
        System.setOut(System.out);
    }
}

