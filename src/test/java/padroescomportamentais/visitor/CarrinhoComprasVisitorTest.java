package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;
import padroescomportamentais.visitor.exemplo2.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarrinhoComprasVisitorTest {

    @Test
    void testar() {
        List<Element> carrinho = new ArrayList<>();
        carrinho.add(new Livro("Padrão de Projetos", 50.0));
        carrinho.add(new Livro("MM história de vida", 45.0));
        carrinho.add(new Eletronico("MS Robozinho", 3.0));
        carrinho.add(new Eletronico("Notebook", 800.0));

        // Calcular o preço total
        PrecoVisitor precoVisitor = new PrecoVisitor();
        for (Element item : carrinho) {
            item.accept(precoVisitor);
        }
        System.out.println("Preço total: R$" + precoVisitor.getTotalPreco());

        // Exibir detalhes dos itens
        DetalhesVisitor detalhesVisitor = new DetalhesVisitor();
        for (Element item : carrinho) {
            item.accept(detalhesVisitor);
        }

        assertNotNull(carrinho);
    }

}
