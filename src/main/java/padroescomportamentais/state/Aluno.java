package padroescomportamentais.state;

public class Aluno {

    private String nome;
    private AlunoEstado estado;

    public Aluno() {
        this.estado = AlunoEstadoMatriculado.getInstance();
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }

    public boolean matricular() {
        return estado.matricular(this);
    }

    public boolean formar() {
        return estado.formar(this);
    }

    public boolean trancar() {
        return estado.trancar(this);
    }

    public boolean jubilar() {
        return estado.jubilar(this);
    }

    public boolean evadir() {
        return estado.evadir(this);
    }

    public boolean transferir() {
        return estado.transferir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AlunoEstado getEstado() {
        return estado;
    }
}
