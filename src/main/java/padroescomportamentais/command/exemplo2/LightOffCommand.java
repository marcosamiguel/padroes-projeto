package padroescomportamentais.command.exemplo2;

public class LightOffCommand implements PadraoCommand {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
