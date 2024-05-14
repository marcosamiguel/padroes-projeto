package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CensoTest {

    @Test
    void deveContarAlunosAtivosCurso() {
        Curso curso = new Curso(
                new Aluno("Marco", true),
                new Aluno("MM", true),
                new Aluno("Jose", false),
                new Aluno("MM", true),
                new Aluno("MM1", false)

        );
        assertEquals(3, Censo.contarAlunosAtivosCurso(curso));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        Curso curso = new Curso(
                new Aluno("Marco", true),
                new Aluno("MM", true),
                new Aluno("Jose", false),
                new Aluno("MM", true)
        );
        assertEquals(4, Censo.contarTotalAlunosCurso(curso));
    }

}