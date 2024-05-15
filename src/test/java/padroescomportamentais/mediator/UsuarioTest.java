package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;
import padroescomportamentais.mediator.exemplo2.MediadorConcreto;
import padroescomportamentais.mediator.exemplo2.Usuario;
import padroescomportamentais.mediator.exemplo2.UsuarioConcreto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UsuarioTest {

    @Test
    public  void testar(){

        MediadorConcreto mediador = new MediadorConcreto();

        Usuario jj = new UsuarioConcreto(mediador, "JJ");
        Usuario  mm = new UsuarioConcreto(mediador, "MM");
        Usuario cc = new UsuarioConcreto(mediador, "CC");

        mediador.adicionarUsuario(jj);
        mediador.adicionarUsuario(mm);
        mediador.adicionarUsuario(cc);

        jj.enviar("Olá, pessoal!");
        mm.enviar("Oi, JJ! Como vai?");
        cc.enviar("Bom dia a todos!");

        assertNotNull(mediador);
    }
}
