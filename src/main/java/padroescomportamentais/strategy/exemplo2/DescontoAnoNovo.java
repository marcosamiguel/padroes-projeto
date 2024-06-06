package padroescomportamentais.strategy.exemplo2;

public class DescontoAnoNovo implements DescontoStrategy{
    @Override
    public double aplicarDesconto(double precoOriginal) {
        return precoOriginal * 0.85; // 15% de desconto
    }
}