package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ParametrosTest {

    @Test
    public void deveRetornarNomeEscola() {
      //  Parametros.getInstance().setNomeEscola("Escola 1");

        System.out.println(Parametros.getInstance());

        assertEquals("Uniacademia", Parametros.getInstance().
                getNomeEscola());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
     //   Parametros.getInstance().setUsuarioLogado("Usuario 1");

        assertEquals("MM",
                Parametros.getInstance().getUsuarioLogado());

        assertEquals("Uniacademia",

                Parametros.getInstance().getNomeEscola());

        System.out.println(Parametros.getInstance());
    }


    @Test
    public void testeSingleton() {
      //  Parametros x = new Parametros();
       // x.getUsuarioLogado();
       // x.getNomeEscola();
       // System.out.println(x);

        assertNotNull(Parametros.getInstance());

        System.out.println(Parametros.getInstance());
    }


    }