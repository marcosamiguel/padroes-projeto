package padroescomportamentais.command;

public class FechamentoSemestreTarefa implements Tarefa {

    private Semestre semestre;

    public FechamentoSemestreTarefa(Semestre semestre) {
        this.semestre = semestre;
    }

    public void executar() {
        this.semestre.fecharSemestre();
        log();
    }

    public void cancelar() {
        this.semestre.abrirSemestre();
        log();
    }

    @Override
    public void log() {
        System.out.print("\nLog do arquivo " + semestre.getSituacao());
    }


}
