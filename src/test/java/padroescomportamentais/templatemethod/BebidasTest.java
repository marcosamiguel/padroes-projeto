package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;
import padroescomportamentais.templatemethod.exemplo2.BebidaQuente;
import padroescomportamentais.templatemethod.exemplo2.Cafe;
import padroescomportamentais.templatemethod.exemplo2.Cha;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BebidasTest {

    @Test
    void testar() {
        BebidaQuente cha = new Cha();
        BebidaQuente cafe = new Cafe();

        System.out.println("Preparando chá:");
        cha.prepararReceita();

        System.out.println("\nPreparando café:");
        cafe.prepararReceita();


        assertNotNull(cha);
    }
}
