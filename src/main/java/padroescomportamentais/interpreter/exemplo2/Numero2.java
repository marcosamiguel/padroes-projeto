package padroescomportamentais.interpreter.exemplo2;

public class Numero2 implements Expressao2 {
    private int numero;

    public Numero2(int numero) {
        this.numero = numero;
    }

    @Override
    public int interpretar() {
        return numero;
    }
}
