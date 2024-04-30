package padroescomportamentais.command;

public class AberturaSemestreTarefa implements Tarefa {

    private Semestre semestre;

    public AberturaSemestreTarefa(Semestre semestre) {
        this.semestre = semestre;
    }

    public void executar() {
        this.semestre.abrirSemestre();
        log();
    }

    public void cancelar() {
        this.semestre.fecharSemestre();
        log();
    }


    @Override
    public void log() {
        System.out.print("\nLog do arquivo " + semestre.getSituacao());
    }
}
