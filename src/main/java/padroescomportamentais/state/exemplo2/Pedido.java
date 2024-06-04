package padroescomportamentais.state.exemplo2;

public class Pedido {
    private State estadoAtual;

    public Pedido() {
        estadoAtual = new PedidoRecebidoState();
    }

    public void setEstado(State estado) {
        this.estadoAtual = estado;
    }

    public void avancar() {
        if (estadoAtual != null) {
            estadoAtual.avancar(this);
        } else {
            System.out.println("Pedido não está em um estado válido.");
        }
    }

    public void cancelar() {
        if (estadoAtual != null) {
            estadoAtual.cancelar(this);
        } else {
            System.out.println("Pedido não está em um estado válido.");
        }
    }
}
