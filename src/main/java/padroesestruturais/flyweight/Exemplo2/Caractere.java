package padroesestruturais.flyweight.Exemplo2;

public class Caractere implements CaractereFlyweight {
    private final char valor;
    private final String fonte;
    private final int tamanho;
    private final boolean negrito;
    private final boolean italico;

    public Caractere(char valor, String fonte, int tamanho, boolean negrito, boolean italico) {
        this.valor = valor;
        this.fonte = fonte;
        this.tamanho = tamanho;
        this.negrito = negrito;
        this.italico = italico;
    }

    @Override
    public void desenhar(int posicao) {
        System.out.println("Caractere: " + valor + " | Fonte: " + fonte + " | Tamanho: " + tamanho +
                " | Negrito: " + negrito + " | Itálico: " + italico + " | Posição: " + posicao);
    }
}
