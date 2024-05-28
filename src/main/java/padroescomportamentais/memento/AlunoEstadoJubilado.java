package padroescomportamentais.memento;

import java.util.Date;

public class AlunoEstadoJubilado implements AlunoEstado {
    private Date dataEstado;
    private AlunoEstadoJubilado() {
    }

    ;
    private static AlunoEstadoJubilado instance = new AlunoEstadoJubilado();

    public static AlunoEstadoJubilado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Jubilado";
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
