package padroescomportamentais.memento;

import java.util.Date;

public class AlunoEstadoMatriculado implements AlunoEstado {
    private Date dataEstado;
    private AlunoEstadoMatriculado() {
    }

    ;
    private static AlunoEstadoMatriculado instance = new AlunoEstadoMatriculado();

    public static AlunoEstadoMatriculado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Matriculado";
    }
    @Override
    public void setData(Date data) {
        dataEstado = data;
    }

    @Override
    public Date getData() {
        return dataEstado;
    }
}
