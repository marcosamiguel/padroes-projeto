package padroescomportamentais.strategy.exemplo2;
public class  DescontoBlackFriday implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double precoOriginal) {
        return precoOriginal * 0.80; // 20% de desconto
    }
}