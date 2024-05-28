package padroescomportamentais.memento;

import java.util.Date;

public class AlunoEstadoTrancado implements AlunoEstado {
    private Date dataEstado;
    private AlunoEstadoTrancado() {
    }

    ;
    private static AlunoEstadoTrancado instance = new AlunoEstadoTrancado();

    public static AlunoEstadoTrancado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Trancado";
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
