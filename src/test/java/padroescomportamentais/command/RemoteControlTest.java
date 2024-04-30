package padroescomportamentais.command;

import org.junit.jupiter.api.Test;
import padroescomportamentais.command.exemplo2.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RemoteControlTest {

    @Test
    void deveAbrirSemestre() {
        Light light = new Light();
        PadraoCommand lightOn = new LightOnCommand(light);
        PadraoCommand lightOff = new LightOffCommand(light);

        RemoteControl control = new RemoteControl();

        // Ligar a lâmpada
        control.setCommand(lightOn);
        control.pressButton();

        // Desligar a lâmpada
        control.setCommand(lightOff);
        control.pressButton();


        assertNotNull(control);
    }

}