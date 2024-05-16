package padroescomportamentais.mediator;

public class Pessoa {

    public String elogiar(String mensagem) {
        return Ouvidoria.getInstancia().receberElogio(mensagem);
    }

    public String reclamar(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacao(mensagem);
    }

    public String sugerir(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestao(mensagem);
    }


}
