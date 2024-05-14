package padroescomportamentais.iterator.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Colecao {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public Iterator<Livro> criarIterator() {
        return new BibliotecaIterator();
    }

    private class BibliotecaIterator implements Iterator<Livro> {
        private int indiceAtual = 0;

        @Override
        public boolean hasNext() {
            return indiceAtual < livros.size();
        }

        @Override
        public Livro next() {
            return livros.get(indiceAtual++);
        }
    }
}