package padroescomportamentais.state.exemplo2;

public class EntregueState implements State {
    @Override
    public void avancar(Pedido pedido) {
        System.out.println("Pedido já foi entregue.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido já foi entregue, não pode ser cancelado.");
    }
}
