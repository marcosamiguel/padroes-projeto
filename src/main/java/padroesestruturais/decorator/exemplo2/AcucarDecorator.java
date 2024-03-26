package padroesestruturais.decorator.exemplo2;

public class AcucarDecorator extends CafeDecorator{
    public AcucarDecorator(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com açúcar";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 0.2;
    }

}
