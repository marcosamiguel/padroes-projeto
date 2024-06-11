package padroescomportamentais.visitor.exemplo2;

public interface Visitor {
    void visit(Livro livro);
    void visit(Eletronico eletronico);
}