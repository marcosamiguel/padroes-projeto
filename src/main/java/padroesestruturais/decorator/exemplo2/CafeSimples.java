package padroesestruturais.decorator.exemplo2;

public class CafeSimples implements Cafe{
    @Override
    public String getDescricao() {
        return "Café simples";
    }

    @Override
    public double getCusto() {
        return 2.0;
    }
}
