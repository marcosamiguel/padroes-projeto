package padroescomportamentais.memento;

import java.util.Date;

public class AlunoEstadoEvadido implements AlunoEstado {


    private Date dataEstado;
    private AlunoEstadoEvadido() {
    }

    ;
    private static AlunoEstadoEvadido instance = new AlunoEstadoEvadido();

    public static AlunoEstadoEvadido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Evadido";
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

