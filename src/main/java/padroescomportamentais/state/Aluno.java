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
        System.out.println("matriculei...");
        return estado.matricular(this);
    }

    public boolean formar() {
        System.out.println("formei...");
        return estado.formar(this);
    }

    public boolean trancar() {
        System.out.println("tranquei MS...");
        return estado.trancar(this);
    }

    public boolean jubilar() {
        System.out.println("jubelei...");
        return estado.jubilar(this);
    }

    public boolean evadir() {
        System.out.println("evadi...");
        return estado.evadir(this);
    }

    public boolean transferir() {
        System.out.println("tranferi...");
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
