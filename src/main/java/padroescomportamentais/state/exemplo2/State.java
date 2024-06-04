package padroescomportamentais.state.exemplo2;

public interface State {

    void avancar(Pedido pedido);
    void cancelar(Pedido pedido);
}
