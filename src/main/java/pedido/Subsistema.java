package main.java.pedido;

import java.util.ArrayList;
import java.util.List;

public abstract class Subsistema {

    private List<PedidoBalcao> pedidosBloqueados = new ArrayList<>();

    public void addPedidoBloqueado(PedidoBalcao pedido) {
        this.pedidosBloqueados.add(pedido);
    }

    public boolean verificarPedidoBloqueado(PedidoBalcao pedido) {
        return this.pedidosBloqueados.contains(pedido);
    }
}
