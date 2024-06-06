package padroescomportamentais.strategy.exemplo2;

public class DescontoNatal implements DescontoStrategy{
    @Override
    public double aplicarDesconto(double precoOriginal) {
        return precoOriginal * 0.90; // 10% de desconto
    }
}
