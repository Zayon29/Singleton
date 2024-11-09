public  class Main {
    public static void main(String[] args) {
        FabricaFiguras fabrica = FabricaFiguras.getInstancia();

        // Teste de criação de um único Círculo
        Figura circulo1 = fabrica.criarCirculo();
        Figura circulo2 = fabrica.criarCirculo();


        // Teste de criação de triângulos específicos
        Figura trianguloIsosceles1 = fabrica.criarTrianguloIsosceles();
        Figura trianguloIsosceles2 = fabrica.criarTrianguloIsosceles();


        Figura trianguloEquilatero1 = fabrica.criarTrianguloEquilatero();
        Figura trianguloEquilatero2 = fabrica.criarTrianguloEquilatero();


        Figura trianguloRetangulo1 = fabrica.criarTrianguloRetangulo();
        Figura trianguloRetangulo2 = fabrica.criarTrianguloRetangulo();


        // Teste de criação de quadrados (instâncias ilimitadas)
        Figura quadrado1 = fabrica.criarQuadrado();
        Figura quadrado2 = fabrica.criarQuadrado();


        // Chamada dos métodos desenhar para ver o funcionamento
        circulo1.desenhar();
        trianguloIsosceles1.desenhar();
        trianguloEquilatero1.desenhar();
        trianguloRetangulo1.desenhar();
        quadrado1.desenhar();
        quadrado2.desenhar();
    }
}