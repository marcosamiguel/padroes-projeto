package padroescomportamentais.command.exemplo2;

public class RemoteControl {
    private PadraoCommand command;

    public void setCommand(PadraoCommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
