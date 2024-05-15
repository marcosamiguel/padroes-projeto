package padroescomportamentais.mediator.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class MediadorConcreto implements Mediador {
    private List<Usuario> usuarios;

    public MediadorConcreto() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {
        for (Usuario usuario : usuarios) {
            // O remetente não deve receber sua própria mensagem
            if (usuario != remetente) {
                usuario.receber(mensagem);
            }
        }
    }
}