package padroescomportamentais.strategy.exemplo2;

public class Produto {
    private String nome;
    private double preco;
    private DescontoStrategy descontoStrategy;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularPrecoComDesconto() {
        if (descontoStrategy != null) {
            return descontoStrategy.aplicarDesconto(preco);
        }
        return preco; // Sem desconto
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
