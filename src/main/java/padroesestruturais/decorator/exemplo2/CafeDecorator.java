package padroesestruturais.decorator.exemplo2;

public abstract class CafeDecorator implements Cafe {
    protected Cafe cafeDecorado;

    public CafeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao();
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto();
    }
}
