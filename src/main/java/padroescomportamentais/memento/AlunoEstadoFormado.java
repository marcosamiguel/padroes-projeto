package padroescomportamentais.memento;

import java.util.Date;

public class AlunoEstadoFormado implements AlunoEstado {

    private Date dataEstado;

    private AlunoEstadoFormado() {
    }

    ;
    private static AlunoEstadoFormado instance = new AlunoEstadoFormado();

    public static AlunoEstadoFormado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Formado";
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
