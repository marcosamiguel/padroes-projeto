package padroescomportamentais.state.exemplo2;

public class PreparandoState implements State {
    @Override
    public void avancar(Pedido pedido) {
        System.out.println("Pedido está sendo entregue.");
        pedido.setEstado(new ProntoParaEntregaState());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado.");
        pedido.setEstado(null);
    }
}