package padroescomportamentais.visitor.exemplo2;

public class DetalhesVisitor implements Visitor {
    @Override
    public void visit(Livro livro) {
        System.out.println("Livro: " + livro.getTitulo() + ", Preço: R$" + livro.getPreco());
    }

    @Override
    public void visit(Eletronico eletronico) {
        System.out.println("Eletrônico: " + eletronico.getNome() + ", Preço: R$" + eletronico.getPreco());
    }
}
