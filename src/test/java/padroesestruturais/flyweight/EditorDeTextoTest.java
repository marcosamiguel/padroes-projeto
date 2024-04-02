package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;
import padroesestruturais.flyweight.Exemplo2.CaractereFlyweight;
import padroesestruturais.flyweight.Exemplo2.FlyweightFabricaDeCaracteres;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EditorDeTextoTest {

    @Test
    void desenhar() {

        FlyweightFabricaDeCaracteres fabrica = new FlyweightFabricaDeCaracteres();

        // Criando alguns caracteres com formatação
        CaractereFlyweight a = fabrica.obterCaractere('A', "Arial", 12, true, false);
        CaractereFlyweight b = fabrica.obterCaractere('B', "Arial", 12, false, true);

        // Desenhando os caracteres em diferentes posições
        a.desenhar(1);
        b.desenhar(2);

        // Reutilizando um caractere existente
        CaractereFlyweight a2 = fabrica.obterCaractere('A', "Arial", 12, true, false);
        a2.desenhar(3);

        System.out.println("a == a2? " + (a == a2)); // Deve imprimir "true", indicando que o mesmo objeto é reutilizado

        assertNotNull(fabrica);
    }

}
