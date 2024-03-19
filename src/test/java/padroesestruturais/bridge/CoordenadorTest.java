package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoordenadorTest {

    @Test
    void deveRetornarSalarioCoordenadorComEnsinoMedio() {
        IEscolaridade IEscolaridade = new EnsinoMedio();
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(IEscolaridade);
        assertEquals(2000.0f, coordenador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComGraduacao() {
        IEscolaridade IEscolaridade = new Graduacao();
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(IEscolaridade);
        assertEquals(2200.0f, coordenador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComMestrado() {
        IEscolaridade escolaridade = new Mestrado();
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(escolaridade);
        assertEquals(2400.0f, coordenador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComDoutorado() {
        IEscolaridade escolaridade = new Doutorado();
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(escolaridade);
        assertEquals(2600.0f, coordenador.calcularSalario(), 0.01f);
    }

}