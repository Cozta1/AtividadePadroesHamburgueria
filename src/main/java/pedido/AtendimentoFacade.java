package main.java.pedido;

public class AtendimentoFacade {

    public static boolean verificarPedido(PedidoBalcao pedido) {
        if (Cozinha.getInstancia().verificarPedidoBloqueado(pedido)) {
            return false;
        }
        if (Caixa.getInstancia().verificarPedidoBloqueado(pedido)) {
            return false;
        }
        if (Entrega.getInstancia().verificarPedidoBloqueado(pedido)) {
            return false;
        }
        return true;
    }
}
