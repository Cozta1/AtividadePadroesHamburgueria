package main.java.pedido;

public abstract class PedidoEstado {

    public abstract String getNome();

    public boolean preparar(Pedido pedido) {
        return false;
    }

    public boolean finalizar(Pedido pedido) {
        return false;
    }

    public boolean entregar(Pedido pedido) {
        return false;
    }

    public boolean cancelar(Pedido pedido) {
        return false;
    }
}
