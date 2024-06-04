package padroescomportamentais.state.exemplo2;

public class PedidoRecebidoState implements State {
    @Override
    public void avancar(Pedido pedido) {
        System.out.println("Pedido está sendo preparado.");
        pedido.setEstado(new PreparandoState());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado.");
        pedido.setEstado(null);
    }
}