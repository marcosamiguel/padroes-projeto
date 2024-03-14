package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AlunoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Aluno aluno = new Aluno(123, "Aluno Original", new Endereco("Rua A", 1), "Juiz de Fora");

        Aluno alunoClone = aluno.clone();
        alunoClone.setMatricula(456);
        alunoClone.setNome("Aluno Clonado");
        alunoClone.getEndereco().setNumero(2);

        assertEquals(aluno.getLocalNascimento(), alunoClone.getLocalNascimento());

        assertNotEquals(aluno.toString(), alunoClone.toString());
        assertNotEquals(aluno.getEndereco().toString(), alunoClone.getEndereco().toString());
    }
}