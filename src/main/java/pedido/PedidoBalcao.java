package main.java.pedido;

public class PedidoBalcao {

    public boolean finalizar() {
        return AtendimentoFacade.verificarPedido(this);
    }
}
