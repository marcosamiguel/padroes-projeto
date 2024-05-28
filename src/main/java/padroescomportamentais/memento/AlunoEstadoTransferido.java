package padroescomportamentais.memento;

import java.util.Date;

public class AlunoEstadoTransferido implements AlunoEstado {
    private Date dataEstado;
    private AlunoEstadoTransferido() {
    }

    ;
    private static AlunoEstadoTransferido instance = new AlunoEstadoTransferido();

    public static AlunoEstadoTransferido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Transferido";
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
