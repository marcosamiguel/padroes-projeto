package padroescomportamentais.state;

import org.junit.jupiter.api.Test;
import padroescomportamentais.state.exemplo2.Pedido;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PedidoTest {

    @Test
    public void testar() {

        Pedido pedido = new Pedido();

        pedido.avancar(); // Pedido está sendo preparado.
        pedido.avancar(); // Pedido está pronto para entrega.
        pedido.avancar(); // Pedido foi entregue.
        pedido.avancar(); // Pedido já foi entregue.
        pedido.cancelar(); // Pedido já foi entregue, não pode ser cancelado.

        assertNotNull(pedido);

    }
}
