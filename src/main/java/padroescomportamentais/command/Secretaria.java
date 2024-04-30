package padroescomportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    private static List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void executarTarefa(Tarefa tarefa) {

        if (getTarefas().size() < 100){
            tarefas.add(tarefa);
            tarefa.executar();
        }else{
            tarefas = new ArrayList<>();
        }
    }

    public void cancelarUltimaTarefa() {
        if (tarefas.size() != 0) {
            Tarefa tarefa = tarefas.get(tarefas.size() - 1);
            tarefa.cancelar();
            tarefas.remove(tarefas.size() - 1);
        }
    }

}
