package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;
import padroesestruturais.adapter.novo.AdaptadorMotorDeCarro;
import padroesestruturais.adapter.novo.Motor;
import padroesestruturais.adapter.novo.MotorDeCarro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MotorTest {

    @Test
    void testarMotor() {
        MotorDeCarro motorDeCarro = new MotorDeCarro();
        Motor adaptador = new AdaptadorMotorDeCarro(motorDeCarro);

        adaptador.ligar(); // Isso irá chamar motorDeCarro.iniciar()
        adaptador.desligar(); // Isso irá chamar motorDeCarro.parar()

        assertNotNull(adaptador);
    }
}
