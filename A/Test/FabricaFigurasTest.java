import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class FabricaFigurasTest {

    private static FabricaFiguras fabrica;

    @BeforeAll
    static void setup() {
        fabrica = FabricaFiguras.getInstancia();
    }

    @Test
    void testSingleton() {
        FabricaFiguras outraInstancia = FabricaFiguras.getInstancia();
        assertSame(fabrica, outraInstancia, "FabricaFiguras não está seguindo o padrão Singleton");
    }

    @Test
    void testCriarCirculoUnico() {
        Figura circulo1 = fabrica.criarCirculo();
        Figura circulo2 = fabrica.criarCirculo();
        assertSame(circulo1, circulo2, "criarCirculo não está retornando a mesma instância");
    }

    @Test
    void testCriarTrianguloIsoscelesUnico() {
        Figura trianguloIsos1 = fabrica.criarTrianguloIsosceles();
        Figura trianguloIsos2 = fabrica.criarTrianguloIsosceles();
        assertSame(trianguloIsos1, trianguloIsos2, "criarTrianguloIsosceles não está retornando a mesma instância");
    }

    @Test
    void testCriarTrianguloEquilateroUnico() {
        Figura trianguloEqui1 = fabrica.criarTrianguloEquilatero();
        Figura trianguloEqui2 = fabrica.criarTrianguloEquilatero();
        assertSame(trianguloEqui1, trianguloEqui2, "criarTrianguloEquilatero não está retornando a mesma instância");
    }

    @Test
    void testCriarTrianguloRetanguloUnico() {
        Figura trianguloRet1 = fabrica.criarTrianguloRetangulo();
        Figura trianguloRet2 = fabrica.criarTrianguloRetangulo();
        assertSame(trianguloRet1, trianguloRet2, "criarTrianguloRetangulo não está retornando a mesma instância");
    }

    @Test
    void testCriarQuadradoIlimitado() {
        Figura quadrado1 = fabrica.criarQuadrado();
        Figura quadrado2 = fabrica.criarQuadrado();
        assertNotSame(quadrado1, quadrado2, "criarQuadrado deve retornar uma nova instância a cada chamada");
    }

    @Test
    void testDesenhar() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        fabrica.criarCirculo().desenhar();
        fabrica.criarTrianguloIsosceles().desenhar();
        fabrica.criarTrianguloEquilatero().desenhar();
        fabrica.criarTrianguloRetangulo().desenhar();
        fabrica.criarQuadrado().desenhar();

        String saidaEsperada = "Círculo\r\n" +
                "Triangulo Isósceles\r\n" +
                "Triangulo Equilátero\r\n" +
                "Triangulo Retangulo\r\n" +
                "Quadrado\r\n";
        assertEquals(saidaEsperada, saidaCapturada.toString(), "A saída do método desenhar não está correta");


        System.setOut(System.out);
    }
}

