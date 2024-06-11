package padroescomportamentais.visitor.exemplo2;

public class Livro implements Element {
    private String titulo;
    private double preco;

    public Livro(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
