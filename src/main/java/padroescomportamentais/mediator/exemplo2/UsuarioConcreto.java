package padroescomportamentais.mediator.exemplo2;

public class UsuarioConcreto extends Usuario {

    public UsuarioConcreto(Mediador mediador, String nome) {
        super(mediador, nome);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println(this.nome + " enviou: " + mensagem);
        mediador.enviarMensagem(mensagem, this);
    }

    @Override
    public void enviar(String mensagem, Usuario arroba) {
        arroba.enviar(mensagem);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println(this.nome + " recebeu: " + mensagem);
    }
}
