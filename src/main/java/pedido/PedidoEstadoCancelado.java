package main.java.pedido;

public class PedidoEstadoCancelado extends PedidoEstado {

    private PedidoEstadoCancelado() {}
    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();
    public static PedidoEstadoCancelado getInstance() {
        return instance;
    }

    public String getNome() {
        return "Cancelado";
    }
}
