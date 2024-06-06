package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;
import padroescomportamentais.strategy.exemplo2.DescontoAnoNovo;
import padroescomportamentais.strategy.exemplo2.DescontoBlackFriday;
import padroescomportamentais.strategy.exemplo2.DescontoNatal;
import padroescomportamentais.strategy.exemplo2.Produto;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProdutoTest {
    @Test
    void testar() {
        Produto produto = new Produto("Notebook", 1000.00);

        System.out.println("Preço original do " + produto.getNome() + ": R$" + produto.getPreco());

        // Aplicar desconto de Natal
        produto.setDescontoStrategy(new DescontoNatal());
        System.out.println("Preço com desconto de Natal: R$" + produto.calcularPrecoComDesconto());

        // Aplicar desconto de Ano Novo
        produto.setDescontoStrategy(new DescontoAnoNovo());
        System.out.println("Preço com desconto de Ano Novo: R$" + produto.calcularPrecoComDesconto());

        // Aplicar desconto de Black Friday
        produto.setDescontoStrategy(new DescontoBlackFriday());
        System.out.println("Preço com desconto de Black Friday: R$" + produto.calcularPrecoComDesconto());

        assertNotNull(produto);
    }
}
