package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import padroescomportamentais.observer.exemplo2.DisplayTemperatura;
import padroescomportamentais.observer.exemplo2.EstacaoMeteorologica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EstacaoMeterologicaTest {

    @Test
    void testar() {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        DisplayTemperatura display1 = new DisplayTemperatura();
        DisplayTemperatura display2 = new DisplayTemperatura();

        estacao.adicionarObservador(display1);
        estacao.adicionarObservador(display2);

        estacao.setTemperatura(25.0f);
        estacao.setTemperatura(30.0f);

        estacao.removerObservador(display1);
        estacao.setTemperatura(35.0f);

        assertNotNull(estacao);
    }
}
