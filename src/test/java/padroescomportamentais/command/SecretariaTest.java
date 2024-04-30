package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecretariaTest {

    Secretaria secretaria;
    Semestre semestre;

    Semestre semestre2;

    @BeforeEach
    void setUp() {
        secretaria = new Secretaria();
        semestre = new Semestre(2024, 1);
        semestre2 = new Semestre(2024, 2);

    }

    @Test
    void deveAbrirSemestre() {
        Tarefa aberturaSemestre = new AberturaSemestreTarefa(semestre);
        secretaria.executarTarefa(aberturaSemestre);
        assertEquals("Semestre aberto", semestre.getSituacao());

        System.out.println("\nTamanho da lista:" + secretaria.getTarefas().size());

    }


    @Test
    void deveFecharSemestre() {
        Tarefa fechamentoSemestre = new FechamentoSemestreTarefa(semestre);
        secretaria.executarTarefa(fechamentoSemestre);
        assertEquals("Semestre fechado", semestre.getSituacao());

        System.out.println("\nTamanho da lista:" + secretaria.getTarefas().size());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Tarefa aberturaSemestre = new AberturaSemestreTarefa(semestre);
        Tarefa fechamentoSemestre = new FechamentoSemestreTarefa(semestre);

        secretaria.executarTarefa(aberturaSemestre);
        secretaria.executarTarefa(fechamentoSemestre);

       secretaria.cancelarUltimaTarefa();

        assertEquals("Semestre aberto", semestre.getSituacao());

        System.out.println("\nTamanho da lista:" + secretaria.getTarefas().size());

    }


    @Test
    void deveAbrirSemestre2() {
        Tarefa t2 = new AberturaSemestreTarefa(semestre2);
        secretaria.executarTarefa(t2);

        assertEquals("Semestre aberto", semestre2.getSituacao());

        System.out.println("\nTamanho da lista:" + secretaria.getTarefas().size());
    }
}