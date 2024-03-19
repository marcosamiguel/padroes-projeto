package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdministrativoTest {

    @Test
    void deveRetornarSalarioAdministrativoComEnsinoMedio() {
        IEscolaridade escolaridade = new EnsinoMedio();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComGraduacao() {
        IEscolaridade escolaridade = new Graduacao();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComMestrado() {
        IEscolaridade escolaridade = new Mestrado();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComDoutorado() {
        IEscolaridade escolaridade = new Doutorado();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

}