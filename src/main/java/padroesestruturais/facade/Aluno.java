package padroesestruturais.facade;

public class Aluno {

    public boolean formar() {
        return AlunoFacade.verificarPendenciasFormatura(this);
    }
}
