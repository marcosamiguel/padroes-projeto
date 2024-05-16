package padroescomportamentais.mediator.exemplo2;

public abstract class Usuario {
    protected Mediador mediador;
    protected String nome;

    public Usuario(Mediador mediador, String nome) {
        this.mediador = mediador;
        this.nome = nome;
    }

    public abstract void enviar(String mensagem);

    public abstract void enviar(String mensagem, Usuario arroba);

    public abstract void receber(String mensagem);
}
