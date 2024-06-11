package padroescomportamentais.visitor.exemplo2;

public class Eletronico implements Element {
    private String nome;
    private double preco;

    public Eletronico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}