package padroesestruturais.decorator.exemplo2;

public class CremeDecorator extends CafeDecorator{

    public CremeDecorator(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com creme";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 0.5;
    }
}
