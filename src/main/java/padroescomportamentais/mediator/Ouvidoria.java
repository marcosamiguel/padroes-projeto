package padroescomportamentais.mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {
    }

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogio(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacao(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestao(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstancia().receberSugestao(mensagem);
    }

}
