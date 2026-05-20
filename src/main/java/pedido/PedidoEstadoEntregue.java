package main.java.pedido;

public class PedidoEstadoEntregue extends PedidoEstado {

    private PedidoEstadoEntregue() {}
    private static PedidoEstadoEntregue instance = new PedidoEstadoEntregue();
    public static PedidoEstadoEntregue getInstance() {
        return instance;
    }

    public String getNome() {
        return "Entregue";
    }
}
