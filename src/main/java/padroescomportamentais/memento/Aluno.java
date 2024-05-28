package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno {

    private AlunoEstado estado;

    private List<AlunoEstado> memento = new ArrayList<AlunoEstado>();

    public AlunoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(AlunoEstado estado) {
        for (AlunoEstado e : this.memento){
           if (e == estado){
               throw new IllegalArgumentException("Estado já existe na lista...");
           }
        }
        this.estado.setData(new Date());
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public void restauraEstado(Date data) {
        for (AlunoEstado e : this.getEstados()) {
            if (e.getData().compareTo(data) > 0){
                this.estado = e;
            }
        }
    }


    public List<AlunoEstado> getEstados() {
        return this.memento;
    }


}
