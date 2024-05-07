package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;
import padroescomportamentais.interpreter.exemplo2.Adicao2;
import padroescomportamentais.interpreter.exemplo2.Expressao2;
import padroescomportamentais.interpreter.exemplo2.Numero2;
import padroescomportamentais.interpreter.exemplo2.Subtracao2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExpressaoInterpreterTest {


    @Test
    public void testar(){

        // Representa a expressão (1 + 2)
        Expressao2 e1 = new Adicao2(new Numero2(1), new Numero2(2));

        // Representa a expressão completa (1 + 2) - 3
        Expressao2 e2 = new Subtracao2(e1, new Numero2(3));

        System.out.println("Resultado da expressão (1 + 2) - 3 é: " + e2.interpretar());

        assertNotNull(e2);
    }

}
