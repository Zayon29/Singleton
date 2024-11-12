public  class Main {
    public static void main(String[] args) {
        FabricaFiguras fabrica = FabricaFiguras.getInstancia();

        // colocando outro circulo para confirmar apenas uma unica saida
        Figura circulo1 = fabrica.criarCirculo();
        Figura circulo2 = fabrica.criarCirculo();


        Figura trianguloIsosceles1 = fabrica.criarTrianguloIsosceles();
        Figura trianguloIsosceles2 = fabrica.criarTrianguloIsosceles();


        Figura trianguloEquilatero1 = fabrica.criarTrianguloEquilatero();
        Figura trianguloEquilatero2 = fabrica.criarTrianguloEquilatero();


        Figura trianguloRetangulo1 = fabrica.criarTrianguloRetangulo();
        Figura trianguloRetangulo2 = fabrica.criarTrianguloRetangulo();


        // testando os  quadrados  para verificar a quantidade de saidas (instâncias ilimitadas)
        Figura quadrado1 = fabrica.criarQuadrado();
        Figura quadrado2 = fabrica.criarQuadrado();


        circulo1.desenhar();
        trianguloIsosceles1.desenhar();
        trianguloEquilatero1.desenhar();
        trianguloRetangulo1.desenhar();
        quadrado1.desenhar();
        quadrado2.desenhar();
    }
}