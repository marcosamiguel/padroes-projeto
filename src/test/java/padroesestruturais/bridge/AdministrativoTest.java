package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdministrativoTest {

    @Test
    void deveRetornarSalarioAdministrativoComEnsinoMedio() {
        IEscolaridade IEscolaridade = new EnsinoMedio();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(IEscolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComGraduacao() {
        IEscolaridade IEscolaridade = new Graduacao();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(IEscolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComMestrado() {
        IEscolaridade IEscolaridade = new Mestrado();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(IEscolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComDoutorado() {
        IEscolaridade IEscolaridade = new Doutorado();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(IEscolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

}