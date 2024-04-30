package padroescomportamentais.command.exemplo2;

public class LightOnCommand implements PadraoCommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
