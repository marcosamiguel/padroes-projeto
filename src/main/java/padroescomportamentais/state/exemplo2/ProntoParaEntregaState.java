package padroescomportamentais.state.exemplo2;

public class ProntoParaEntregaState implements State {
    @Override
    public void avancar(Pedido pedido) {
        System.out.println("Pedido foi entregue.");
        pedido.setEstado(new EntregueState());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido não pode ser cancelado, já está pronto para entrega.");
    }
}
