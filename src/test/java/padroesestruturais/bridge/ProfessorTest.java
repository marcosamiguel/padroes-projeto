package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfessorTest {

    @Test
    void deveRetornarSalarioProfessorComEnsinoMedio() {
        IEscolaridade escolaridade = new EnsinoMedio();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(100.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComGraduacao() {
        IEscolaridade escolaridade = new Graduacao();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(110.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComMestrado() {
        IEscolaridade escolaridade = new Mestrado();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(120.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComDoutorado() {
        IEscolaridade escolaridade = new Doutorado();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(130.0f, professor.calcularSalario(), 0.01f);
    }


    @Test
    void deveRetornarSalarioProfessorComPos() {
        IEscolaridade escolaridade = new PosGraduacao();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(115.0f, professor.calcularSalario(), 0.01f);
    }

}