package test.java;

import main.java.Hamburguer;
import main.java.complementos.Bacon;
import main.java.hamburguerBasico.FabricaComumBoi;
import main.java.hamburguerBasico.HamburguerBasico;
import main.java.hamburguerBasico.FabricaIntegralFrango;
import main.java.pedido.*;
import main.java.preparo.PreparoXFrango;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    @Test
    public void novoPedidoComecaRecebido() {
        assertEquals("Recebido", pedido.getNomeEstado());
        assertEquals(PedidoEstadoRecebido.getInstance(), pedido.getEstado());
    }
    @Test
    public void devePrepararPedidoRecebido() {
        assertTrue(pedido.preparar());
        assertEquals(PedidoEstadoEmPreparo.getInstance(), pedido.getEstado());
    }
    @Test
    public void deveCancelarPedidoRecebido() {
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }
    @Test
    public void naoDeveFinalizarNemEntregarPedidoRecebido() {
        assertFalse(pedido.finalizar());
        assertFalse(pedido.entregar());
    }



    @Test
    public void deveFinalizarPedidoEmPreparo() {
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        assertTrue(pedido.finalizar());
        assertEquals(PedidoEstadoPronto.getInstance(), pedido.getEstado());
    }
    @Test
    public void deveCancelarPedidoEmPreparo() {
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }
    @Test
    public void naoDevePrepararNemEntregarPedidoEmPreparo() {
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        assertFalse(pedido.preparar());
        assertFalse(pedido.entregar());
    }



    @Test
    public void deveEntregarPedidoPronto() {
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }
    @Test
    public void naoDeveCancelarPedidoPronto() {
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        assertFalse(pedido.cancelar());
        assertFalse(pedido.preparar());
        assertFalse(pedido.finalizar());
    }



    @Test
    public void pedidoEntregueNaoAceitaTransicoes() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.preparar());
        assertFalse(pedido.finalizar());
        assertFalse(pedido.entregar());
        assertFalse(pedido.cancelar());
    }
    @Test
    public void pedidoCanceladoNaoAceitaTransicoes() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.preparar());
        assertFalse(pedido.finalizar());
        assertFalse(pedido.entregar());
        assertFalse(pedido.cancelar());
    }



    @Test
    public void fluxoCompletoRecebidoAteEntregue() {
        assertTrue(pedido.preparar());
        assertTrue(pedido.finalizar());
        assertTrue(pedido.entregar());
        assertEquals("Entregue", pedido.getNomeEstado());
    }



    @Test
    public void pedidoGuardaHamburguer() {
        Hamburguer h = new Bacon(new HamburguerBasico(new FabricaComumBoi()));
        Pedido p = new Pedido(h);
        assertEquals("Recebido", p.getNomeEstado());
        assertEquals(h, p.getHamburguer());
    }


    
    @Test
    public void pedidoForneceInstrucoesDePreparo() {
        Hamburguer h = new HamburguerBasico(new FabricaIntegralFrango());
        Pedido p = new Pedido(h, new PreparoXFrango());
        assertEquals(
                "Tostar pao brioche | Grelhar file de frango | Queijo, alface e maionese | finalizar e servir",
                p.instrucoesPreparo()
        );
        assertEquals("X-Frango", p.getPreparo().getTipo());
    }

    @Test
    public void pedidoSemPreparoRetornaInstrucoesVazias() {
        assertEquals("", new Pedido().instrucoesPreparo());
    }
}
