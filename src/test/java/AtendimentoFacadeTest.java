package test.java;

import main.java.pedido.Caixa;
import main.java.pedido.Cozinha;
import main.java.pedido.Entrega;
import main.java.pedido.PedidoBalcao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoFacadeTest {

    @Test
    void deveBloquearPedidoNaCozinha() {
        PedidoBalcao pedido = new PedidoBalcao();
        Cozinha.getInstancia().addPedidoBloqueado(pedido);
        assertFalse(pedido.finalizar());
    }

    @Test
    void deveBloquearPedidoNoCaixa() {
        PedidoBalcao pedido = new PedidoBalcao();
        Caixa.getInstancia().addPedidoBloqueado(pedido);
        assertFalse(pedido.finalizar());
    }

    @Test
    void deveBloquearPedidoNaEntrega() {
        PedidoBalcao pedido = new PedidoBalcao();
        Entrega.getInstancia().addPedidoBloqueado(pedido);
        assertFalse(pedido.finalizar());
    }

    @Test
    void deveFinalizarPedidoSemBloqueio() {
        PedidoBalcao pedido = new PedidoBalcao();
        assertTrue(pedido.finalizar());
    }
}
