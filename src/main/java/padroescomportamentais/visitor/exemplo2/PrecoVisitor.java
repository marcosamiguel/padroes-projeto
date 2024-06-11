package padroescomportamentais.visitor.exemplo2;

public class PrecoVisitor implements Visitor {
    private double totalPreco;

    public double getTotalPreco() {
        return totalPreco;
    }

    @Override
    public void visit(Livro livro) {
        totalPreco += livro.getPreco();
    }

    @Override
    public void visit(Eletronico eletronico) {
        totalPreco += eletronico.getPreco();
    }
}
