package test.java;

import main.java.ingrediente.IngredienteFactory;
import main.java.ingrediente.PedidoFlyweight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PedidoFlyweightTest {

    @BeforeEach
    void setUp() {
        IngredienteFactory.limparIngredientes();
    }

    @Test
    void deveRetornarItensPedido() {
        PedidoFlyweight pedido = new PedidoFlyweight();
        pedido.adicionarItem(2, "Bacon", 4.50);
        pedido.adicionarItem(1, "Bacon", 4.50);
        pedido.adicionarItem(3, "Queijo Cheddar", 3.00);
        pedido.adicionarItem(1, "Ovo", 1.50);

        List<String> esperado = Arrays.asList(
                "ItemPedido{quantidade=2, ingrediente='Bacon', custoUnidade= R$ 4.5}",
                "ItemPedido{quantidade=1, ingrediente='Bacon', custoUnidade= R$ 4.5}",
                "ItemPedido{quantidade=3, ingrediente='Queijo Cheddar', custoUnidade= R$ 3.0}",
                "ItemPedido{quantidade=1, ingrediente='Ovo', custoUnidade= R$ 1.5}");

        assertEquals(esperado, pedido.obterItensPedido());
    }

    @Test
    void ingredientesIguaisSaoCompartilhados() {
        PedidoFlyweight pedido = new PedidoFlyweight();
        pedido.adicionarItem(2, "Bacon", 4.50);
        pedido.adicionarItem(1, "Bacon", 4.50);
        pedido.adicionarItem(3, "Queijo Cheddar", 3.00);
        pedido.adicionarItem(1, "Ovo", 1.50);

        // 4 itens, mas so 3 ingredientes distintos em cache
        assertEquals(3, IngredienteFactory.getTotalIngredientes());
    }
}
