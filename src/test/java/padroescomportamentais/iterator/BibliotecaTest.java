package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;
import padroescomportamentais.iterator.exemplo2.Biblioteca;
import padroescomportamentais.iterator.exemplo2.Iterator;
import padroescomportamentais.iterator.exemplo2.Livro;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BibliotecaTest {


    @Test
    public void testar(){

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro("Livro 1", "JJM"));
        biblioteca.adicionarLivro(new Livro("Livro 2", "MM"));

        Iterator<Livro> iterator = biblioteca.criarIterator();
        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            System.out.println(livro.getNome());
        }

        assertNotNull(biblioteca);
    }
}
