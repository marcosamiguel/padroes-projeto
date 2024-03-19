package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfessorTest {

    @Test
    void deveRetornarSalarioProfessorComEnsinoMedio() {
        IEscolaridade IEscolaridade = new EnsinoMedio();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(IEscolaridade);
        professor.setNumAulas(2);
        assertEquals(100.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComGraduacao() {
        IEscolaridade IEscolaridade = new Graduacao();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(IEscolaridade);
        professor.setNumAulas(2);
        assertEquals(110.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComMestrado() {
        IEscolaridade IEscolaridade = new Mestrado();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(IEscolaridade);
        professor.setNumAulas(2);
        assertEquals(120.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComDoutorado() {
        IEscolaridade IEscolaridade = new Doutorado();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(IEscolaridade);
        professor.setNumAulas(2);
        assertEquals(130.0f, professor.calcularSalario(), 0.01f);
    }

}