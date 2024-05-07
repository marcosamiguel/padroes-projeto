package padroescomportamentais.interpreter.exemplo2;

public class Subtracao2 implements Expressao2 {
    private Expressao2 primeiraExpressao;
    private Expressao2 segundaExpressao;

    public Subtracao2(Expressao2 primeiraExpressao, Expressao2 segundaExpressao) {
        this.primeiraExpressao = primeiraExpressao;
        this.segundaExpressao = segundaExpressao;
    }

    @Override
    public int interpretar() {
        return primeiraExpressao.interpretar() - segundaExpressao.interpretar();
    }
}
