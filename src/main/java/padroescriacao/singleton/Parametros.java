package padroescriacao.singleton;

public class Parametros {

    private Parametros() {
    }

    ;
    private static Parametros instance;

    public static Parametros getInstance() {
        if (instance == null){
            instance = new Parametros();
            getInstance().nomeEscola = "Uniacademia";
            getInstance().usuarioLogado = "MM";
        }

        return instance;
    }

    private String nomeEscola;
    private String usuarioLogado;

    public String getNomeEscola() {
        return nomeEscola;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }


    @Override
    public String toString() {
        return getNomeEscola() + " - " +
                getUsuarioLogado() + " hash: " +
                super.toString();
    }
}
