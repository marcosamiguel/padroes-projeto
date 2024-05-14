package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Curso implements Iterable<Aluno> {

    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Curso(Aluno... alunos) {
        this.setAlunos(Arrays.asList(alunos));
    }

    @Override
    public Iterator<Aluno> iterator() {
        return getAlunos().iterator();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}


