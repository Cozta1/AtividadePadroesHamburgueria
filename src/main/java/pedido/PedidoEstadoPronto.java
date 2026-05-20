package main.java.pedido;

public class PedidoEstadoPronto extends PedidoEstado {

    private PedidoEstadoPronto() {}
    private static PedidoEstadoPronto instance = new PedidoEstadoPronto();
    public static PedidoEstadoPronto getInstance() {
        return instance;
    }

    public String getNome() {
        return "Pronto";
    }

    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }
}
