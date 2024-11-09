public class FabricaFiguras {
    private static FabricaFiguras instancia;
    private Circulo circulo;
    private TrianguloIsos trianguloIsos;
    private TrianguloEqui trianguloEqui;
    private TrianguloRetangulo trianguloRet;

    private FabricaFiguras() {}

    public static  FabricaFiguras getInstancia() {
        if (instancia == null) {
            instancia = new FabricaFiguras();
        }
        return instancia;
    }
    public Circulo criarCirculo(){
        if (circulo == null) {
            circulo = new Circulo();
        }
        return circulo;

    }
    public TrianguloIsos criarTrianguloIsosceles() {
        if (trianguloIsos == null) {
            trianguloIsos = new TrianguloIsos();
        }
        return trianguloIsos;
    }


    public TrianguloEqui criarTrianguloEquilatero() {
        if (trianguloEqui == null) {
            trianguloEqui = new TrianguloEqui();
        }
        return trianguloEqui;
    }


    public TrianguloRetangulo criarTrianguloRetangulo() {
        if (trianguloRet == null) {
            trianguloRet = new TrianguloRetangulo();
        }
        return trianguloRet;
    }


    public Quadrado criarQuadrado() {
        return new Quadrado();
    }
}


