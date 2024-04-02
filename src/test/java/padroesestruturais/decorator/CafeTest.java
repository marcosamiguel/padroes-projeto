package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;
import padroesestruturais.decorator.exemplo2.AcucarDecorator;
import padroesestruturais.decorator.exemplo2.Cafe;
import padroesestruturais.decorator.exemplo2.CafeSimples;
import padroesestruturais.decorator.exemplo2.CremeDecorator;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CafeTest {

    @Test
    void fazerCafe() {

        Cafe cafe = new CafeSimples();
        System.out.println("Café simples: " + cafe.getDescricao() + ", custo: $" + cafe.getCusto());

        Cafe cafeDecorado = new CremeDecorator(new AcucarDecorator(new CafeSimples()));
        System.out.println("Café decorado: " + cafeDecorado.getDescricao() + ", custo: $"
                + cafeDecorado.getCusto());


        assertNotNull(cafeDecorado);
    }


}
