package padroescomportamentais.memento.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class EditorEstados {
    private final List<Memento> historico = new ArrayList<>();
    private int indiceAtual = -1;

    public void salvarEstado(EditorTexto editor) {
        // Remover estados futuros após o estado atual
        while (historico.size() > indiceAtual + 1) {
            historico.remove(historico.size() - 1);
        }
        historico.add(editor.salvar());
        indiceAtual++;
    }

    public void desfazer(EditorTexto editor) {
        if (indiceAtual <= 0) {
            System.out.println("Não há estados anteriores para desfazer.");
            return;
        }
        indiceAtual--;
        Memento memento = historico.get(indiceAtual);
        editor.restaurar(memento);
    }

    public void refazer(EditorTexto editor) {
        if (indiceAtual >= historico.size() - 1) {
            System.out.println("Não há estados futuros para refazer.");
            return;
        }
        indiceAtual++;
        Memento memento = historico.get(indiceAtual);
        editor.restaurar(memento);
    }
}
