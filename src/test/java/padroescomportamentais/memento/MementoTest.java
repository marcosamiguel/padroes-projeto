package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;
import padroescomportamentais.memento.exemplo2.EditorEstados;
import padroescomportamentais.memento.exemplo2.EditorTexto;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MementoTest {
    @Test
    void testarMemento() {

        EditorTexto editor = new EditorTexto();
        EditorEstados estados = new EditorEstados();

        editor.setTexto("Versão 1");
        estados.salvarEstado(editor);
        System.out.println("Estado atual: " + editor.getTexto());

        editor.setTexto("Versão 2");
        estados.salvarEstado(editor);
        System.out.println("Estado atual: " + editor.getTexto());

        editor.setTexto("Versão 3");
        estados.salvarEstado(editor);
        System.out.println("Estado atual: " + editor.getTexto());

        estados.desfazer(editor);
        System.out.println("Após desfazer: " + editor.getTexto());

        estados.desfazer(editor);
        System.out.println("Após desfazer: " + editor.getTexto());

        estados.refazer(editor);
        System.out.println("Após refazer: " + editor.getTexto());

        estados.refazer(editor);
        System.out.println("Após refazer: " + editor.getTexto());


        assertNotNull(estados);

    }
}
